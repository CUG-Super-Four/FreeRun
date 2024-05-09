package com.freerun.promotion.strategy.scope;

import com.freerun.api.client.course.CourseClient;
import com.freerun.api.dto.course.CourseSimpleInfoDTO;
import com.freerun.common.exceptions.BizIllegalException;
import com.freerun.common.utils.CollUtils;
import com.freerun.promotion.constants.ScopeType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component(ScopeType.COURSE_HANDLER_NAME)
public class CourseScopeNameHandler implements ScopeNameHandler {

    private final CourseClient courseClient;

    @Override
    public List<String> getNameByIds(List<Long> scopeIds) {
        List<CourseSimpleInfoDTO> infos = courseClient.getSimpleInfoList(scopeIds);
        if (CollUtils.isEmpty(infos)) {
            throw new BizIllegalException("课程信息不存在");
        }
        return infos.stream().map(CourseSimpleInfoDTO::getName).collect(Collectors.toList());
    }
}
