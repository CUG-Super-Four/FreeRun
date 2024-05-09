package com.freerun.remark.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.freerun.remark.domain.dto.LikeRecordFormDTO;
import com.freerun.remark.domain.po.LikedRecord;

import java.util.List;
import java.util.Set;

/**
 * <p>
 * 点赞记录表 服务类
 * </p>

 */
public interface ILikedRecordService extends IService<LikedRecord> {

    void addLikeRecord(LikeRecordFormDTO recordDTO);

    Set<Long> isBizLiked(List<Long> bizIds);

    void readLikedTimesAndSendMessage(String bizType, int maxBizSize);
}
