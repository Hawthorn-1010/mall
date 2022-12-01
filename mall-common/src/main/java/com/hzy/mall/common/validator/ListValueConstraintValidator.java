package com.hzy.mall.common.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * User: hzy
 * Date: 2022/12/1
 * Time: 9:10
 * Description:
 */
public class ListValueConstraintValidator implements ConstraintValidator<ListValue, Integer> {

    private Set<Integer> set = new HashSet<>();

    // 初始化方法
    @Override
    public void initialize(ListValue constraintAnnotation) {
        int[] vals = constraintAnnotation.vals();
        for (int val : vals) {
            set.add(val);
        }
    }
    // 判断是否校验成功
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        // TODO 超过125没有问题吗
        if (set.contains(value)) {
            return true;
        }
        return false;
    }
}
