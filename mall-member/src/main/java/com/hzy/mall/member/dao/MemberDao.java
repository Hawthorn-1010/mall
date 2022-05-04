package com.hzy.mall.member.dao;

import com.hzy.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hezhiying
 * @email hzy10101010@163.com
 * @date 2022-05-04 10:30:24
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
