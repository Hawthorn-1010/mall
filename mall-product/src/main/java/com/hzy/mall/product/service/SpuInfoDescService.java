package com.hzy.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hzy.common.utils.PageUtils;
import com.hzy.mall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author hezhiying
 * @email hzy10101010@163.com
 * @date 2022-05-03 22:46:07
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

