package com.freerun.user.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.freerun.user.domain.po.UserDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 教师详情表 Mapper 接口
 * </p>
 */
public interface UserDetailMapper extends BaseMapper<UserDetail> {

    UserDetail queryById(Long userId);

    List<UserDetail> queryByIds(List<Long> ids);

    Page<UserDetail> queryByPage(Page<UserDetail> p, @Param("ew") QueryWrapper<UserDetail> wrapper);
}
