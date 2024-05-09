package com.freerun.learning.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.freerun.learning.domain.po.NoteUser;
import com.freerun.learning.mapper.NoteUserMapper;
import com.freerun.learning.service.INoteUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>

 */
@Service
public class NoteUserServiceImpl extends ServiceImpl<NoteUserMapper, NoteUser> implements INoteUserService {

}
