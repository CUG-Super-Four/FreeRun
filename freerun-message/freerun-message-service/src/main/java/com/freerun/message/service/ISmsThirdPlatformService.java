package com.freerun.message.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.freerun.common.domain.dto.PageDTO;
import com.freerun.message.domain.dto.SmsThirdPlatformDTO;
import com.freerun.message.domain.dto.SmsThirdPlatformFormDTO;
import com.freerun.message.domain.po.SmsThirdPlatform;
import com.freerun.message.domain.query.SmsThirdPlatformPageQuery;

import java.util.List;

/**
 * <p>
 * 第三方云通讯平台 服务类
 * </p>

 */
public interface ISmsThirdPlatformService extends IService<SmsThirdPlatform> {

    List<SmsThirdPlatform> queryAllPlatform();

    Long saveSmsThirdPlatform(SmsThirdPlatformFormDTO thirdPlatformDTO);

    void updateSmsThirdPlatform(SmsThirdPlatformFormDTO thirdPlatformDTO);

    PageDTO<SmsThirdPlatformDTO> querySmsThirdPlatforms(SmsThirdPlatformPageQuery query);

    SmsThirdPlatformDTO querySmsThirdPlatform(Long id);
}
