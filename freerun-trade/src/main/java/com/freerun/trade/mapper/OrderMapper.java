package com.freerun.trade.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.freerun.trade.domain.po.Order;

/**
 * <p>
 * 订单 Mapper 接口
 * </p>
 */
public interface OrderMapper extends BaseMapper<Order> {

    Order getById(Long id);
}
