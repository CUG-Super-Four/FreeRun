package com.freerun.message.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.freerun.common.domain.dto.PageDTO;
import com.freerun.message.domain.dto.NoticeTaskDTO;
import com.freerun.message.domain.dto.NoticeTaskFormDTO;
import com.freerun.message.domain.po.NoticeTask;
import com.freerun.message.domain.query.NoticeTaskPageQuery;

/**
 * <p>
 * 系统通告的任务表，可以延期或定期发送通告 服务类
 * </p>

 */
public interface INoticeTaskService extends IService<NoticeTask> {

    Long saveNoticeTask(NoticeTaskFormDTO noticeTaskFormDTO);

    void handleTask(NoticeTask noticeTask);

    void updateNoticeTask(NoticeTaskFormDTO noticeTaskFormDTO);

    PageDTO<NoticeTaskDTO> queryNoticeTasks(NoticeTaskPageQuery pageQuery);

    NoticeTaskDTO queryNoticeTask(Long id);

    PageDTO<NoticeTask> queryTodoNoticeTaskByPage(int pageNo, int size);
}
