package com.freerun.promotion.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.freerun.promotion.domain.po.Promotion;
import com.freerun.promotion.mapper.PromotionMapper;
import com.freerun.promotion.service.IPromotionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 促销活动，形式多种多样，例如：优惠券 服务实现类
 * </p>

 */
@Service
public class PromotionServiceImpl extends ServiceImpl<PromotionMapper, Promotion> implements IPromotionService {

}
