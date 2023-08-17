package com.heima.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.admin.dtos.AdUserDTO;
import com.heima.model.admin.pojos.AdUser;
import com.heima.model.common.dtos.ResponseResult;

/**
 * AdUserService
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/17 23:55
 * @say 山河总静好，人事也从容
 */
public interface AdUserService extends IService<AdUser> {
    /**
     * 登录功能
     * @param DTO
     * @return
     */
    ResponseResult login(AdUserDTO DTO);
}