package com.freerun.user.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.freerun.common.enums.UserType;
import com.freerun.user.domain.po.UserDetail;
import com.freerun.user.domain.query.UserPageQuery;

import java.util.List;

/**
 * <p>
 * 教师详情表 服务类
 * </p>
 */
public interface IUserDetailService extends IService<UserDetail> {

    UserDetail queryById(Long userId);

    List<UserDetail> queryByIds(List<Long> ids);

    Page<UserDetail> queryUserDetailByPage(UserPageQuery pageQuery, UserType type);
}
