package com.hzy.mall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

// import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hzy.mall.product.entity.CategoryEntity;
import com.hzy.mall.product.service.CategoryService;
import com.hzy.mall.common.utils.PageUtils;
import com.hzy.mall.common.utils.R;



/**
 * 商品三级分类
 *
 * @author hezhiying
 * @email hzy10101010@163.com
 * @date 2022-05-03 23:21:04
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 列表，三级分类，以父子结构展示
     */
    @RequestMapping("/list/tree")
    // @RequiresPermissions("product:category:list")
    public R list(){
        List<CategoryEntity> entities = categoryService.listWithTree();

        return R.ok().put("data", entities);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    // @RequiresPermissions("product:category:info")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:category:save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    @RequestMapping("/update/sort")
    // @RequiresPermissions("product:category:update")
    public R updateSort(@RequestBody CategoryEntity[] category){
        categoryService.updateBatchById(Arrays.asList(category));
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:category:update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     * @RequestBody: 获取请求体，必须发送post请求
     * Spring MVC 自动将请求体的数据（json），转为对应的数组
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:category:delete")
    public R delete(@RequestBody Long[] catIds){

        // 检查当前删除的菜单是否被别的地方引用
		// categoryService.removeByIds(Arrays.asList(catIds));
        categoryService.removeMenuById(Arrays.asList(catIds));
        return R.ok();
    }

}
