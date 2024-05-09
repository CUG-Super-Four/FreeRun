package com.freerun.trade.service;

import com.freerun.trade.domain.dto.OrderDelayQueryDTO;
import com.freerun.trade.domain.dto.PayApplyFormDTO;
import com.freerun.trade.domain.vo.PayChannelVO;

import java.util.List;

public interface IPayService {
    List<PayChannelVO> queryPayChannels();

    String applyPayOrder(PayApplyFormDTO payApply);

    void queryPayResult(OrderDelayQueryDTO message);
}
