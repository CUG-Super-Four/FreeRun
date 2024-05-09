package com.freerun.message.domain.query;

import com.freerun.common.domain.query.PageQuery;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "通知模板查询对象")
@Data
public class NoticeTemplatePageQuery extends PageQuery {
    private Integer status;
    private String keyword;
}
