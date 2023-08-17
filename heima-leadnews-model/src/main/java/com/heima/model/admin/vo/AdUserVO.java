package com.heima.model.admin.vo;

import lombok.Data;

import java.util.Date;

/**
 * AdUserVO
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/18 0:04
 * @say 山河总静好，人事也从容
 */
@Data
public class AdUserVO {
    private Integer id;
    private String name;
    private String nickname;
    private String image;
    private String email;
    private Date loginTime;
    private Date createdTime;
}