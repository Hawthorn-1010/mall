package com.hzy.mall.coupon.dao;

import com.hzy.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hezhiying
 * @email hzy10101010@163.com
 * @date 2022-05-04 10:25:27
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
