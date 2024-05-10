package com.freerun.promotion.strategy.discount;

import com.freerun.common.utils.NumberUtils;
import com.freerun.common.utils.StringUtils;
import com.freerun.promotion.domain.po.Coupon;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PriceDiscount implements Discount{
    /**
     * 折扣值，如果是满减则存满减金额，如果是折扣，则存折扣率，8折就是存80
     */
    private final int discountValue;

    /**
     * 使用门槛，0：表示无门槛，其他值：最低消费金额
     */
    private final int thresholdAmount;
    private static final String RULE_TEMPLATE = "满{}减{}";


    @Override
    public boolean canUse(int totalAmount, Coupon coupon) {
        return totalAmount >= coupon.getThresholdAmount();
    }

    @Override
    public int calculateDiscount(int totalAmount, Coupon coupon) {
        return coupon.getDiscountValue();
    }

    @Override
    public String getRule(Coupon coupon) {
        return StringUtils.format(
                RULE_TEMPLATE,
                NumberUtils.scaleToStr(coupon.getThresholdAmount(), 2),
                NumberUtils.scaleToStr(coupon.getDiscountValue(), 2)
        );
    }
}
