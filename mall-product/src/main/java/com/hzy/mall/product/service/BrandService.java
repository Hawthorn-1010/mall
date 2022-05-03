package com.hzy.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hzy.common.utils.PageUtils;
import com.hzy.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author hezhiying
 * @email hzy10101010@163.com
 * @date 2022-05-03 22:46:07
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

