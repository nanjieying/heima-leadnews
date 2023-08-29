package com.heima.model.threadlocal;

import com.heima.model.wemedia.pojos.WmUser;

/**
 * WmThreadLocalUtils
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/28 22:39
 * @say 山河总静好，人事也从容
 */
public class WmThreadLocalUtils {
    private final static ThreadLocal<WmUser> userThreadLocal = new ThreadLocal<>();
    /**
     * 设置当前线程中的用户
     * @param user
     */
    public static void setUser(WmUser user){
        userThreadLocal.set(user);
    }
    /**
     * 获取线程中的用户
     * @return
     */
    public static WmUser getUser( ){
        return userThreadLocal.get();
    }
    /**
     * 清空线程中的用户信息
     */
    public static void clear(){
        userThreadLocal.remove();
    }
}