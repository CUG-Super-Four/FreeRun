package com.freerun.learning.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.freerun.api.dto.leanring.LearningLessonDTO;
import com.freerun.learning.domain.dto.LearningRecordFormDTO;
import com.freerun.learning.domain.po.LearningRecord;

/**
 * <p>
 * 学习记录表 服务类
 * </p>

 */
public interface ILearningRecordService extends IService<LearningRecord> {

    LearningLessonDTO queryLearningRecordByCourse(Long courseId);

    void addLearningRecord(LearningRecordFormDTO formDTO);
}
