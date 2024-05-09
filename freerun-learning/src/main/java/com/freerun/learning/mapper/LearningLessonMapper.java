package com.freerun.learning.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.freerun.learning.domain.po.LearningLesson;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 学生课程表 Mapper 接口
 * </p>

 */
public interface LearningLessonMapper extends BaseMapper<LearningLesson> {

    Integer queryTotalPlan(@Param("userId") Long userId);
}
