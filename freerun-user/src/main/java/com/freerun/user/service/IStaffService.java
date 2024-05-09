package com.freerun.user.service;

import com.freerun.common.domain.dto.PageDTO;
import com.freerun.user.domain.query.UserPageQuery;
import com.freerun.user.domain.vo.StaffVO;

/**
 * <p>
 * 员工详情表 服务类
 * </p>
 */
public interface IStaffService {
    PageDTO<StaffVO> queryStaffPage(UserPageQuery pageQuery);
}
