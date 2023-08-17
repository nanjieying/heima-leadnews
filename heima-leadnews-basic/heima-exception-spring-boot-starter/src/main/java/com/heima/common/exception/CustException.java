package com.heima.common.exception;

import com.heima.model.common.enums.AppHttpCodeEnum;

/**
 * CustException
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/18 0:03
 * @say 山河总静好，人事也从容
 */
public class CustException {
    public static void cust(AppHttpCodeEnum codeEnum) {
        throw new CustomException(codeEnum );
    }
    public static void cust(AppHttpCodeEnum codeEnum,String msg) {
        throw new CustomException(codeEnum,msg);
    }
}