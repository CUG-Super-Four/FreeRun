package com.freerun.promotion.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.freerun.promotion.domain.po.CouponScope;
import com.freerun.promotion.mapper.CouponScopeMapper;
import com.freerun.promotion.service.ICouponScopeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 优惠券作用范围信息 服务实现类
 * </p>

 */
@Service
public class CouponScopeServiceImpl extends ServiceImpl<CouponScopeMapper, CouponScope> implements ICouponScopeService {
}
