package com.freerun.learning.domain.vo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.freerun.common.domain.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description = "学习计划分页统计结果")
public class LearningPlanPageVO extends PageDTO<LearningPlanVO> {
    @ApiModelProperty("本周积分值")
    private Integer weekPoints;
    @ApiModelProperty("本周完成的计划数量")
    private Integer weekFinished;
    @ApiModelProperty("总的计划学习数量")
    private Integer weekTotalPlan;

    public LearningPlanPageVO() {
    }

    public LearningPlanPageVO pageInfo(Long total, Long pages, List<LearningPlanVO> list) {
        this.total = total;
        this.pages = pages;
        this.list = list;
        return this;
    }

    public LearningPlanPageVO emptyPage(Page<?> page) {
        this.total = page.getTotal();
        this.pages = page.getPages();
        return this;
    }

}