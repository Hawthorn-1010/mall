package com.hzy.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hzy.common.utils.PageUtils;
import com.hzy.mall.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author hezhiying
 * @email hzy10101010@163.com
 * @date 2022-05-04 10:29:08
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

