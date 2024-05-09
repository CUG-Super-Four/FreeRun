package com.freerun.pay.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.freerun.pay.domain.po.PayChannel;
import com.freerun.pay.sdk.dto.PayChannelDTO;

/**
 * <p>
 * 支付渠道 服务类
 * </p>

 */
public interface IPayChannelService extends IService<PayChannel> {

    Long addPayChannel(PayChannelDTO channelDTO);

    void updatePayChannel(PayChannelDTO channelDTO);
}
