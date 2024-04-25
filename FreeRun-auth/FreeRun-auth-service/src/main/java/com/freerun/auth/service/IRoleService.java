package com.freerun.auth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.freerun.auth.domain.po.Role;

import java.util.List;

/**
 * 角色表 服务类
 */
public interface IRoleService extends IService<Role> {

    boolean exists(Long roleId);
    boolean exists(List<Long> roleIds);

    void deleteRole(Long id);
}
