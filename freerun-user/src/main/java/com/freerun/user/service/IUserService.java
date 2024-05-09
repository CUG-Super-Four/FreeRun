package com.freerun.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.freerun.api.dto.user.LoginFormDTO;
import com.freerun.api.dto.user.UserDTO;
import com.freerun.common.domain.dto.LoginUserDTO;
import com.freerun.user.domain.dto.UserFormDTO;
import com.freerun.user.domain.po.User;
import com.freerun.user.domain.vo.UserDetailVO;

/**
 * <p>
 * 学员用户表 服务类
 * </p>
 */
public interface IUserService extends IService<User> {
    LoginUserDTO queryUserDetail(LoginFormDTO loginDTO, boolean isStaff);

    void resetPassword(Long userId);

    UserDetailVO myInfo();

    void addUserByPhone(User user, String code);

    void updatePasswordByPhone(String cellPhone, String code, String password);

    Long saveUser(UserDTO userDTO);

    void updateUser(UserDTO userDTO);

    void updateUserWithPassword(UserFormDTO userDTO);
}
