package com.freerun.pay.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.freerun.common.utils.BeanUtils;
import com.freerun.pay.domain.po.PayChannel;
import com.freerun.pay.mapper.PayChannelMapper;
import com.freerun.pay.sdk.dto.PayChannelDTO;
import com.freerun.pay.service.IPayChannelService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 支付渠道 服务实现类
 * </p>

 */
@Service
public class PayChannelServiceImpl extends ServiceImpl<PayChannelMapper, PayChannel> implements IPayChannelService {

    @Override
    public Long addPayChannel(PayChannelDTO channelDTO) {
        // 1.属性转换
        PayChannel payChannel = BeanUtils.toBean(channelDTO, PayChannel.class);
        // 2.保存
        save(payChannel);
        return payChannel.getId();
    }

    @Override
    public void updatePayChannel(PayChannelDTO channelDTO) {
        // 1.属性转换
        PayChannel payChannel = BeanUtils.toBean(channelDTO, PayChannel.class);
        // 2.保存
        updateById(payChannel);
    }
}
