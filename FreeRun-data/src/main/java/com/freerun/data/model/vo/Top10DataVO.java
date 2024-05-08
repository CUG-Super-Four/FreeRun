package com.freerun.data.model.vo;

import com.freerun.data.model.po.CourseInfo;
import lombok.Data;

import java.util.List;


@Data
public class Top10DataVO {
    // 热门课程
    private List<CourseInfo> hot;
    // 热销课程
    private List<CourseInfo> hotSales;
}
