package com.hzy.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hzy.mall.common.utils.PageUtils;
import com.hzy.mall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author hezhiying
 * @email hzy10101010@163.com
 * @date 2022-05-04 10:25:27
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

