package com.freerun.exam.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.freerun.api.dto.IdAndNumDTO;
import com.freerun.exam.domain.po.Question;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 题目 Mapper 接口
 * </p>
 */
public interface QuestionMapper extends BaseMapper<Question> {

    List<IdAndNumDTO> countQuestionOfCreater(@Param("createrIds") List<Long> createrIds);

}
