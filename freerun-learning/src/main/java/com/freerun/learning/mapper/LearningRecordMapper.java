package com.freerun.learning.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.freerun.api.dto.IdAndNumDTO;
import com.freerun.learning.domain.po.LearningRecord;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 学习记录表 Mapper 接口
 * </p>

 */
public interface LearningRecordMapper extends BaseMapper<LearningRecord> {

    List<IdAndNumDTO> countLearnedSections(
            @Param("userId") Long userId,
            @Param("begin") LocalDateTime begin,
            @Param("end") LocalDateTime end);
}
