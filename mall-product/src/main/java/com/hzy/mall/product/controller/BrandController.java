package com.hzy.mall.product.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// import org.apache.shiro.authz.annotation.RequiresPermissions;
import com.hzy.mall.common.validator.group.AddGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hzy.mall.product.entity.BrandEntity;
import com.hzy.mall.product.service.BrandService;
import com.hzy.mall.common.utils.PageUtils;
import com.hzy.mall.common.utils.R;

import javax.validation.Valid;


/**
 * 品牌
 *
 * @author hezhiying
 * @email hzy10101010@163.com
 * @date 2022-05-03 23:21:04
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:brand:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    // @RequiresPermissions("product:brand:info")
    public R info(@PathVariable("brandId") Long brandId){
		BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:brand:save")
    public R save(@Validated({AddGroup.class}) @RequestBody BrandEntity brand/*, BindingResult result*/){
//		if (result.hasErrors()) {
//            Map<String, String> map = new HashMap<>();
//            result.getFieldErrors().forEach((item) -> {
//                // 错误信息
//                String msg = item.getDefaultMessage();
//                // 不合法的字段
//                String field = item.getField();
//                map.put(field, msg);
//            });
//            return R.error(400, "校验的结果不合法").put("data", map);
//        }
        brandService.save(brand);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:brand:update")
    public R update(@RequestBody BrandEntity brand){
		brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:brand:delete")
    public R delete(@RequestBody Long[] brandIds){
		brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
