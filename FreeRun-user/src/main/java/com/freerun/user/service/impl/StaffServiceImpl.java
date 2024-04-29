package com.freerun.user.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.freerun.api.cache.RoleCache;
import com.freerun.common.domain.dto.PageDTO;
import com.freerun.common.enums.UserType;
import com.freerun.common.utils.BeanUtils;
import com.freerun.user.domain.po.UserDetail;
import com.freerun.user.domain.query.UserPageQuery;
import com.freerun.user.domain.vo.StaffVO;
import com.freerun.user.service.IStaffService;
import com.freerun.user.service.IUserDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 员工详情表 服务实现类
 */
@Service
@RequiredArgsConstructor
public class StaffServiceImpl implements IStaffService {

    private final IUserDetailService detailService;
    private final RoleCache roleCache;
    @Override
    public PageDTO<StaffVO> queryStaffPage(UserPageQuery query) {
        // 1.搜索
        Page<UserDetail> p = detailService.queryUserDetailByPage(query, UserType.STAFF);
        // 2.处理vo
        return PageDTO.of(p, u -> {
            StaffVO v = BeanUtils.toBean(u, StaffVO.class);
            v.setRoleName(roleCache.getRoleName(u.getRoleId()));
            return v;
        });
    }
}
