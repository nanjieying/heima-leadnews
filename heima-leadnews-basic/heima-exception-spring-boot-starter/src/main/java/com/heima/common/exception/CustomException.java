package com.heima.common.exception;

import com.heima.model.common.enums.AppHttpCodeEnum;

/**
 * CustomException
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/17 10:55
 * @say 山河总静好，人事也从容
 */
public class CustomException extends RuntimeException {

    // 异常处理的枚举
    private AppHttpCodeEnum appHttpCodeEnum;

    public CustomException(AppHttpCodeEnum appHttpCodeEnum) {
        this.appHttpCodeEnum = appHttpCodeEnum;
    }
    public CustomException(AppHttpCodeEnum appHttpCodeEnum,String msg) {
        appHttpCodeEnum.setErrorMessage(msg);
        this.appHttpCodeEnum = appHttpCodeEnum;
    }
    public AppHttpCodeEnum getAppHttpCodeEnum() {
        return appHttpCodeEnum;
    }
}