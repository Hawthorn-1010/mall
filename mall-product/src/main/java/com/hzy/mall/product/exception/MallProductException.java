package com.hzy.mall.product.exception;

import com.hzy.mall.common.exception.BizCodeEnum;
import com.hzy.mall.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

/**
 * User: hzy
 * Date: 2022/12/1
 * Time: 7:56
 * Description:
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.hzy.mall.product.controller")
public class MallProductException {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e) {
        log.error("异常信息: {}, 异常类型: {}", e.getMessage(), e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        HashMap<String, String> map = new HashMap<>();
        bindingResult.getFieldErrors().forEach((error) -> {
            map.put(error.getField(), error.getDefaultMessage());
        });
        return R.error(BizCodeEnum.VALID_EXCEPTION.getCode(), BizCodeEnum.VALID_EXCEPTION.getMsg()).put("data", map);
    }

    @ExceptionHandler(value = Throwable.class)
    public R handleThrowable(Throwable throwable) {
        return R.error(BizCodeEnum.UNKNOWN_EXCEPTION.getCode(), BizCodeEnum.UNKNOWN_EXCEPTION.getMsg());
    }
}
