package com.hzy.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hzy.mall.common.utils.PageUtils;
import com.hzy.mall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author hezhiying
 * @email hzy10101010@163.com
 * @date 2022-05-04 10:32:26
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

