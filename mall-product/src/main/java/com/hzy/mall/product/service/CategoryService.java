package com.hzy.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hzy.mall.common.utils.PageUtils;
import com.hzy.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author hezhiying
 * @email hzy10101010@163.com
 * @date 2022-05-03 22:46:07
 */
public interface CategoryService extends IService<CategoryEntity> {
    List<CategoryEntity> listWithTree();

    void removeMenuById(List<Long> asList);

    PageUtils queryPage(Map<String, Object> params);
}

