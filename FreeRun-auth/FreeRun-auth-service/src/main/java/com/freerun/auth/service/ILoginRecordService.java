package com.freerun.auth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.freerun.auth.domain.po.LoginRecord;

/**
 * 登录信息记录表 服务类
 */
public interface ILoginRecordService extends IService<LoginRecord> {

    void saveAsync(LoginRecord record);

    void loginSuccess(String cellphone, Long userId);
}
