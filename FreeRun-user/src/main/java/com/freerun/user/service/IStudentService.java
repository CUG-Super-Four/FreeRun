package com.freerun.user.service;

import com.freerun.common.domain.dto.PageDTO;
import com.freerun.user.domain.dto.StudentFormDTO;
import com.freerun.user.domain.query.UserPageQuery;
import com.freerun.user.domain.vo.StudentPageVo;

/**
 * 学员详情表 服务类
 */
public interface IStudentService {

    void saveStudent(StudentFormDTO studentFormDTO);

    void updateMyPassword(StudentFormDTO studentFormDTO);

    PageDTO<StudentPageVo> queryStudentPage(UserPageQuery pageQuery);
}
