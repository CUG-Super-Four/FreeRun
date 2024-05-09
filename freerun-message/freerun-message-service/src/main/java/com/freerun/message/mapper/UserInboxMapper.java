package com.freerun.message.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.freerun.message.domain.po.UserInbox;

/**
 * <p>
 * 用户通知记录 Mapper 接口
 * </p>

 */
public interface UserInboxMapper extends BaseMapper<UserInbox> {

    UserInbox queryLatestPublicNotice(Long userId);
}
