package com.freerun.trade.mapper;

import com.freerun.trade.domain.po.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 订单 Mapper 接口
 * </p>

 */
public interface OrderMapper extends BaseMapper<Order> {

    Order getById(Long id);
}
