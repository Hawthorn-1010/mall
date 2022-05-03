package com.hzy.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hzy.common.utils.PageUtils;
import com.hzy.mall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author hezhiying
 * @email hzy10101010@163.com
 * @date 2022-05-03 22:46:07
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

