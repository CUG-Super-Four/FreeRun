package com.freerun.promotion.strategy.discount;

import com.freerun.common.utils.NumberUtils;
import com.freerun.common.utils.StringUtils;
import com.freerun.promotion.domain.po.Coupon;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RateDiscount implements Discount {
    /**
     * 折扣值，如果是满减则存满减金额，如果是折扣，则存折扣率，8折就是存80
     */
    private final int discountValue;

    /**
     * 使用门槛，0：表示无门槛，其他值：最低消费金额
     */
    private final int thresholdAmount;

    /**
     * 最高优惠金额，满减最大，0：表示没有限制，不为0，则表示该券有金额的限制
     */
    private final int maxDiscountAmount;


    private static final String RULE_TEMPLATE = "满{}打{}折，上限{}元";

    @Override
    public boolean canUse(int totalAmount, Coupon coupon) {
        return totalAmount >= coupon.getThresholdAmount();
    }

    @Override
    public int calculateDiscount(int totalAmount,  Coupon coupon) {
        // 计算折扣，扩大100倍计算，向下取整，单位是分
        return Math.min(coupon.getMaxDiscountAmount(), totalAmount * (100 - coupon.getDiscountValue()) / 100);
    }

    @Override
    public String getRule( Coupon coupon) {
        return StringUtils.format(
                RULE_TEMPLATE,
                NumberUtils.scaleToStr(coupon.getThresholdAmount(), 2),
                NumberUtils.scaleToStr(coupon.getDiscountValue(), 1),
                NumberUtils.scaleToStr(coupon.getMaxDiscountAmount(), 2)
        );
    }
}
