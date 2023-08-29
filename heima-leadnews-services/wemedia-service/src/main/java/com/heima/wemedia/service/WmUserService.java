package com.heima.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.wemedia.dtos.WmUserDTO;
import com.heima.model.wemedia.pojos.WmUser;

/**
 * WmUserService
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/18 14:12
 * @say 山河总静好，人事也从容
 */
public interface WmUserService extends IService<WmUser> {
    /**
     * 登录
     * @param dto
     * @return
     */
    public ResponseResult login(WmUserDTO dto);
}