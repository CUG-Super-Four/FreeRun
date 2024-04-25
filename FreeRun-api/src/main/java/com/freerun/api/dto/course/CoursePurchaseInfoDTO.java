package com.freerun.api.dto.course;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@ApiModel("课程购买信息")
@NoArgsConstructor
@AllArgsConstructor
public class CoursePurchaseInfoDTO {
    @ApiModelProperty("报名人数")
    private Integer enrollNum;
    @ApiModelProperty("退款人数")
    private Integer refundNum;
    @ApiModelProperty("实付总金额")
    private Integer realPayAmount;
}
