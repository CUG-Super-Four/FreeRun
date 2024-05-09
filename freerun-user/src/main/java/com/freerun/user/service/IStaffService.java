package com.freerun.user.service;

import com.freerun.common.domain.dto.PageDTO;
import com.freerun.user.domain.query.UserPageQuery;
import com.freerun.user.domain.vo.StaffVO;

/**
 * <p>
 * 员工详情表 服务类
 * </p>
 *
 * @author 虎哥
 * @since 2022-07-12
 */
public interface IStaffService {
    PageDTO<StaffVO> queryStaffPage(UserPageQuery pageQuery);
}
