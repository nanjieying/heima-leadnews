package com.heima.model.wemedia.vo;

import lombok.Data;

import java.util.Date;

/**
 * WmUserVO
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/25 17:57
 * @say 山河总静好，人事也从容
 */
@Data
public class WmUserVO {
    private Integer id;
    private String name;
    private String nickname;
    private String image;
    private String email;
    private Date loginTime;
    private Date createdTime;
}