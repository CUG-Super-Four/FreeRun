package com.freerun.message.service;

import com.freerun.api.dto.sms.SmsInfoDTO;
import com.freerun.api.dto.user.UserDTO;
import com.freerun.message.domain.po.NoticeTemplate;

import java.util.List;

public interface ISmsService {
    void sendMessageByTemplate(NoticeTemplate noticeTemplate, List<UserDTO> users);

    void sendMessage(SmsInfoDTO smsInfoDTO);

    void sendMessageAsync(SmsInfoDTO smsInfoDTO);
}
