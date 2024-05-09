package com.freerun.media.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.freerun.media.domain.dto.FileDTO;
import com.freerun.media.domain.po.File;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 * 文件表，可以是普通文件、图片等 服务类
 * </p>

 */
public interface IFileService extends IService<File> {

    FileDTO uploadFile(MultipartFile file);

    FileDTO getFileInfo(Long id);
}
