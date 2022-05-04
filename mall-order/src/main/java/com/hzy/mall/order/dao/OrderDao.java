package com.hzy.mall.order.dao;

import com.hzy.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hezhiying
 * @email hzy10101010@163.com
 * @date 2022-05-04 10:29:08
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
