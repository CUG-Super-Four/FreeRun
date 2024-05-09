package com.freerun.search.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.freerun.api.cache.CategoryCache;
import com.freerun.api.dto.course.CategoryBasicDTO;
import com.freerun.common.utils.CollUtils;
import com.freerun.common.utils.StringUtils;
import com.freerun.common.utils.UserContext;
import com.freerun.search.domain.po.Interests;
import com.freerun.search.mapper.InterestsMapper;
import com.freerun.search.service.IInterestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 用户兴趣表，保存感兴趣的二级分类id 服务实现类
 * </p>
 *
 * @author 虎哥
 * @since 2022-07-21
 */
@Service
public class InterestsServiceImpl extends ServiceImpl<InterestsMapper, Interests> implements IInterestsService {

    @Autowired
    private CategoryCache categoryCache;

    @Override
    public void saveInterests(List<Long> interestedIds) {
        // 1.获取当前用户
        Long userId = UserContext.getUser();
        String ids = CollUtils.joinIgnoreNull(interestedIds, ",");
        if(StringUtils.isBlank(ids)){
            // 说明没有兴趣爱好，直接删除
            removeById(userId);
            return;
        }
        // 2.封装数据
        Interests interests = new Interests();
        interests.setId(userId);
        interests.setInterests(CollUtils.join(interestedIds, ","));
        // 3.保存
        saveOrUpdate(interests);
    }

    @Override
    public List<CategoryBasicDTO> queryMyInterests() {
        // 1.获取兴趣爱好id
        List<Long> ids = queryMyInterestsIds();
        // 2.获取缓存结果
        return categoryCache.queryCategoryByIds(ids);
    }

    @Override
    public List<Long> queryMyInterestsIds() {
        // 1.获取当前用户
        Long userId = UserContext.getUser();
        // 2.查询兴趣爱好
        Interests interests = getById(userId);
        if (interests == null || StringUtils.isBlank(interests.getInterests())) {
            return CollUtils.emptyList();
        }
        // 3.获取分类信息
        String[] ids = interests.getInterests().split(",");
        if (ids.length == 0) {
            return CollUtils.emptyList();
        }
        try {
            // 4.转换并返回
            return Arrays.stream(ids).map(Long::valueOf).collect(Collectors.toList());
        } catch (Exception e) {
            // 5.数据转换异常，返回空
            return CollUtils.emptyList();
        }
    }
}
