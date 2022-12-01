package com.hzy.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import com.hzy.mall.common.validator.ListValue;
import com.hzy.mall.common.validator.group.AddGroup;
import com.hzy.mall.common.validator.group.UpdateGroup;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;

/**
 * 品牌
 * 
 * @author hezhiying
 * @email hzy10101010@163.com
 * @date 2022-05-03 22:46:07
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@Null(message = "新增不能指定ID", groups = {AddGroup.class})
	@NotBlank(message = "修改必须指定ID", groups = {UpdateGroup.class})
	@TableId
	private Long brandId;
	/**
	 * 品牌名
	 */
	@NotBlank(message = "名称不能为空！", groups = {AddGroup.class, UpdateGroup.class})
	private String name;
	/**
	 * 品牌logo地址
	 */
	@URL(message = "logo必须为合法的URL地址")
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	@ListValue(vals = {0, 1}, groups = {AddGroup.class})
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	@Pattern(regexp = "^[a-zA-Z]$")
	private String firstLetter;
	/**
	 * 排序
	 */
	@Min(value = 0, message = "排序必须大于等于0")
	private Integer sort;

}
