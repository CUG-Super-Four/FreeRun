package com.freerun.data.service;


import com.freerun.data.model.dto.Top10DataSetDTO;
import com.freerun.data.model.vo.Top10DataVO;


public interface Top10Service {

    /**
     * 获取top数据
     *
     * @return
     */
    Top10DataVO getTop10Data();

    /**
     * top 10数据设置
     * @param top10DataSetDTO
     */
    void setTop10Data(Top10DataSetDTO top10DataSetDTO);
}