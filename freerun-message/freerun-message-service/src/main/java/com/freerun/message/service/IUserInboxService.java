package com.freerun.message.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.freerun.api.dto.user.UserDTO;
import com.freerun.common.domain.dto.PageDTO;
import com.freerun.message.domain.dto.UserInboxDTO;
import com.freerun.message.domain.dto.UserInboxFormDTO;
import com.freerun.message.domain.po.NoticeTemplate;
import com.freerun.message.domain.po.UserInbox;
import com.freerun.message.domain.query.UserInboxQuery;

import java.util.List;

/**
 * <p>
 * 用户通知记录 服务类
 * </p>

 */
public interface IUserInboxService extends IService<UserInbox> {

    void saveNoticeToInbox(NoticeTemplate noticeTemplate, List<UserDTO> users);

    PageDTO<UserInboxDTO> queryUserInBoxesPage(UserInboxQuery query);

    Long sentMessageToUser(UserInboxFormDTO userInboxFormDTO);
}
