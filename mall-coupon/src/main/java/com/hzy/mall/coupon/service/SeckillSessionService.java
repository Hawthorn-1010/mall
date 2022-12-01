package com.hzy.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.hzy.mall.common.utils.PageUtils;
import com.hzy.mall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author hezhiying
 * @email hzy10101010@163.com
 * @date 2022-05-04 10:25:27
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

