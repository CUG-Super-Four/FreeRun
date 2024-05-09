package com.freerun.promotion.strategy.discount;

import com.freerun.common.utils.NumberUtils;
import com.freerun.common.utils.StringUtils;
import com.freerun.promotion.domain.po.Coupon;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NoThresholdDiscount implements Discount{

    private static final String RULE_TEMPLATE = "无门槛抵{}元";

    @Override
    public boolean canUse(int totalAmount, Coupon coupon) {
        return totalAmount > coupon.getDiscountValue();
    }

    @Override
    public int calculateDiscount(int totalAmount, Coupon coupon) {
        return coupon.getDiscountValue();
    }

    @Override
    public String getRule(Coupon coupon) {
        return StringUtils.format(RULE_TEMPLATE, NumberUtils.scaleToStr(coupon.getDiscountValue(), 2));
    }
}
