package com.freerun.learning.service;

import com.freerun.learning.domain.vo.SignResultVO;

public interface ISignRecordService {
    SignResultVO addSignRecords();

    Byte[] querySignRecords();

}
