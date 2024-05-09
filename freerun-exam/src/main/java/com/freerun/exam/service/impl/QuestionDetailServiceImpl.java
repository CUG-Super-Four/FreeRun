package com.freerun.exam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.freerun.exam.domain.po.QuestionDetail;
import com.freerun.exam.mapper.QuestionDetailMapper;
import com.freerun.exam.service.IQuestionDetailService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 题目 服务实现类
 * </p>
 */
@Service
public class QuestionDetailServiceImpl extends ServiceImpl<QuestionDetailMapper, QuestionDetail> implements IQuestionDetailService {

}
