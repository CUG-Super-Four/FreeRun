package com.freerun.trade.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.freerun.trade.domain.po.RefundApply;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 退款申请 Mapper 接口
 * </p>
 */
public interface RefundApplyMapper extends BaseMapper<RefundApply> {

    @Select("SELECT id FROM refund_apply WHERE status = 1 LIMIT 1")
    Long nextRefundApplyToApprove();

    List<RefundApply> queryByDetailId(Long detailId);
}
