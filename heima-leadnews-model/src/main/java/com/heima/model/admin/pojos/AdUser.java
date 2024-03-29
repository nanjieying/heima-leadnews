package com.heima.model.admin.pojos;

/**
 * AdUser
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/17 23:51
 * @say 山河总静好，人事也从容
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <p>
 * 管理员用户信息表
 * </p>
 * @author itheima
 */
@Data
@TableName("ad_user")
public class AdUser{
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    /**
     * 登录用户名
     */
    @TableField("name")
    private String name;
    /**
     * 登录密码
     */
    @TableField("password")
    private String password;
    /**
     * 盐
     */
    @TableField("salt")
    private String salt;

    /**
     * 昵称
     */
    @TableField("nickname")
    private String nickname;

    /**
     * 头像
     */
    @TableField("image")
    private String image;

    /**
     * 手机号
     */
    @TableField("phone")
    private String phone;
    /**
     * 状态
     0 暂时不可用
     1 永久不可用
     9 正常可用
     */
    @TableField("status")
    private Integer status;
    /**
     * 邮箱
     */
    @TableField("email")
    private String email;
    /**
     * 最后一次登录时间
     */
    @TableField("login_time")
    private Date loginTime;
    /**
     * 创建时间
     */
    @TableField("created_time")
    private Date createdTime;
}