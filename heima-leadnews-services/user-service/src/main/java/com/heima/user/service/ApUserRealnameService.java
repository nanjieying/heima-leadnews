package com.heima.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.admin.pojos.ApUserRealname;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.user.dtos.AuthDTO;

/**
 * ApUserRealnameService
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/18 13:47
 * @say 山河总静好，人事也从容
 */
public interface ApUserRealnameService extends IService<ApUserRealname> {
    /**
     * 根据状态查询需要认证相关的用户信息
     * @param DTO
     * @return
     */
    ResponseResult loadListByStatus(AuthDTO DTO);
    /**
     * 根据状态进行审核
     * @param dto
     * @param status  2 审核失败   9 审核成功
     * @return
     */
    ResponseResult updateStatusById(AuthDTO dto, Short status);
}