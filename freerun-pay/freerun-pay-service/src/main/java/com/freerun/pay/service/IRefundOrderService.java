package com.freerun.pay.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.freerun.common.domain.dto.PageDTO;
import com.freerun.pay.domain.po.RefundOrder;
import com.freerun.pay.sdk.dto.RefundApplyDTO;
import com.freerun.pay.sdk.dto.RefundResultDTO;

/**
 * <p>
 * 退款订单 服务类
 * </p>

 */
public interface IRefundOrderService extends IService<RefundOrder> {

    RefundResultDTO applyRefund(RefundApplyDTO refundApplyDTO);

    RefundResultDTO queryRefundResult(Long bizRefundOrderId);

    RefundOrder queryByRefundOrderNo(Long refundOrderNo);

    PageDTO<RefundOrder> queryRefundingOrderByPage(int pageNo, int size);

    void checkRefundOrder(RefundOrder refundOrder);

    RefundResultDTO queryRefundDetail(Long bizRefundOrderId);
}
