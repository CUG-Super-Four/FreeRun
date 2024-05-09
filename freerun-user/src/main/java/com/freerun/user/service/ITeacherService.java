package com.freerun.user.service;

import com.freerun.common.domain.dto.PageDTO;
import com.freerun.user.domain.query.UserPageQuery;
import com.freerun.user.domain.vo.TeacherPageVO;

/**
 * <p>
 * 教师详情表 服务类
 * </p>
 */
public interface ITeacherService{
    PageDTO<TeacherPageVO> queryTeacherPage(UserPageQuery pageQuery);

}
