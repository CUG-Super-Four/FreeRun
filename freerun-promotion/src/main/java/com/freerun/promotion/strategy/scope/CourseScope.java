package com.freerun.promotion.strategy.scope;

import com.freerun.api.dto.promotion.OrderCourseDTO;
import com.freerun.promotion.constants.ScopeType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class CourseScope implements Scope {

    private final List<Long> scopeIds;

    @Override
    public boolean canUse(OrderCourseDTO course) {
        return scopeIds.contains(course.getId());
    }

    @Override
    public ScopeType getType() {
        return ScopeType.COURSE;
    }
}
