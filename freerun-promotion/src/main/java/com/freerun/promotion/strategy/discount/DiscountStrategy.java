package com.freerun.promotion.strategy.discount;

import com.freerun.promotion.enums.DiscountType;

import java.util.EnumMap;

public class DiscountStrategy {

    private final static EnumMap<DiscountType, Discount> strategies;

    static {
        strategies = new EnumMap<>(DiscountType.class);
        strategies.put(DiscountType.NO_THRESHOLD, new NoThresholdDiscount(0));
        strategies.put(DiscountType.PER_PRICE_DISCOUNT, new PerPriceDiscount(0,0,0));
        strategies.put(DiscountType.RATE_DISCOUNT, new RateDiscount(0,0,0));
        strategies.put(DiscountType.PRICE_DISCOUNT, new PriceDiscount(0,0));
    }

    public static Discount getDiscount(DiscountType type) {
        return strategies.get(type);
    }
}
