package com.hzy.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hzy.mall.common.utils.PageUtils;
import com.hzy.mall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author hezhiying
 * @email hzy10101010@163.com
 * @date 2022-05-04 10:30:24
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

