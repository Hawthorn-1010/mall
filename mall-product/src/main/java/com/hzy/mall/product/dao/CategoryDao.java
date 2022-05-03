package com.hzy.mall.product.dao;

import com.hzy.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hezhiying
 * @email hzy10101010@163.com
 * @date 2022-05-03 22:46:07
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
