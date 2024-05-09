package com.freerun.pay.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.freerun.common.domain.dto.PageDTO;
import com.freerun.pay.domain.po.PayOrder;
import com.freerun.pay.sdk.dto.PayApplyDTO;
import com.freerun.pay.sdk.dto.PayResultDTO;

import java.time.LocalDateTime;

/**
 * <p>
 * 支付订单 服务类
 * </p>

 */
public interface IPayOrderService extends IService<PayOrder> {

    String applyPayOrder(PayApplyDTO payApplyDTO);

    PayOrder queryByBizOrderNo(Long bizOrderNo);

    PayResultDTO queryPayResult(Long bizOrderId);

    PayOrder queryByPayOrderNo(Long payOrderNo);

    boolean markPayOrderSuccess(Long id, LocalDateTime successTime);

    PageDTO<PayOrder> queryPayingOrderByPage(int page, int size);

    void checkPayOrder(PayOrder payOrder);
}
