package com.freerun.learning.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.freerun.common.domain.dto.PageDTO;
import com.freerun.learning.domain.dto.QuestionFormDTO;
import com.freerun.learning.domain.po.InteractionQuestion;
import com.freerun.learning.domain.query.QuestionAdminPageQuery;
import com.freerun.learning.domain.query.QuestionPageQuery;
import com.freerun.learning.domain.vo.QuestionAdminVO;
import com.freerun.learning.domain.vo.QuestionVO;

/**
 * <p>
 * 互动提问的问题表 服务类
 * </p>

 */
public interface IInteractionQuestionService extends IService<InteractionQuestion> {

    void saveQuestion(QuestionFormDTO questionDTO);

    PageDTO<QuestionVO> queryQuestionPage(QuestionPageQuery query);

    QuestionVO queryQuestionById(Long id);

    PageDTO<QuestionAdminVO> queryQuestionPageAdmin(QuestionAdminPageQuery query);

    QuestionAdminVO queryQuestionByIdAdmin(Long id);

    void hiddenQuestion(Long id, Boolean hidden);

    void updateQuestion(Long id, QuestionFormDTO questionDTO);

    void deleteById(Long id);
}
