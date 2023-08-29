package com.heima.model.user.dtos;

import com.heima.model.common.dtos.PageRequestDTO;
import lombok.Data;

/**
 * AuthDTO
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/18 13:46
 * @say 山河总静好，人事也从容
 */
@Data
public class AuthDTO extends PageRequestDTO {
    //状态
    private Short status;
    // 认证用户ID
    private Integer id;
    //驳回的信息
    private String msg;
}