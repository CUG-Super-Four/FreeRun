package com.freerun.promotion.service;

import com.freerun.api.dto.promotion.CouponDiscountDTO;
import com.freerun.api.dto.promotion.OrderCouponDTO;
import com.freerun.api.dto.promotion.OrderCourseDTO;

import java.util.List;

public interface IDiscountService {
    List<CouponDiscountDTO> findDiscountSolution(List<OrderCourseDTO> orderCourses);

    CouponDiscountDTO queryDiscountDetailByOrder(OrderCouponDTO orderCouponDTO);
}
