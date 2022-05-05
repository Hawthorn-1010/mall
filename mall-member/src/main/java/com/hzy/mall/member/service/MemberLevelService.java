package com.hzy.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hzy.mall.common.utils.PageUtils;
import com.hzy.mall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author hezhiying
 * @email hzy10101010@163.com
 * @date 2022-05-04 10:30:25
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

