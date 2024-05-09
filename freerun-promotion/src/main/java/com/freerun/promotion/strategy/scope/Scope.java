package com.freerun.promotion.strategy.scope;

import com.freerun.api.dto.promotion.OrderCourseDTO;
import com.freerun.promotion.constants.ScopeType;

import java.util.List;

public interface Scope {

    boolean canUse(OrderCourseDTO course);

    ScopeType getType();

    List<Long> getScopeIds();
}
