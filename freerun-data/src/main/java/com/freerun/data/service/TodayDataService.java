package com.freerun.data.service;


import com.freerun.data.model.dto.TodayDataDTO;
import com.freerun.data.model.vo.TodayDataVO;


public interface TodayDataService {

    /**
     * 获取今日数据
     * @return
     */
    TodayDataVO get();

    /**
     * 设置今日数据
     * @param todayDataDTO
     */
    void set(TodayDataDTO todayDataDTO);
}