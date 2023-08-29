package com.heima.model.wemedia.dtos;

import lombok.Data;

/**
 * WmUserDTO
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/25 17:56
 * @say 山河总静好，人事也从容
 */
@Data
public class WmUserDTO {
    /**
     * 用户名
     */
    private String name;
    /**
     * 密码
     */
    private String password;
}