package com.freerun.media.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.freerun.common.domain.dto.PageDTO;
import com.freerun.media.domain.dto.MediaDTO;
import com.freerun.media.domain.dto.MediaUploadResultDTO;
import com.freerun.media.domain.po.Media;
import com.freerun.media.domain.query.MediaQuery;
import com.freerun.media.domain.vo.MediaVO;
import com.freerun.media.domain.vo.VideoPlayVO;

/**
 * <p>
 * 媒资表，主要是视频文件 服务类
 * </p>

 */
public interface IMediaService extends IService<Media> {

    String getUploadSignature();

    VideoPlayVO getPlaySignatureBySectionId(Long fileId);

    MediaDTO save(MediaUploadResultDTO mediaResult);

    void updateMediaProcedureResult(Media media);

    void deleteMedia(String fileId);

    VideoPlayVO getPlaySignatureByMediaId(Long mediaId);

    PageDTO<MediaVO> queryMediaPage(MediaQuery query);
}
