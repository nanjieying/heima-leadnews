package com.heima.model.admin.pojos;

/**
 * AdSensitive
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/17 17:37
 * @say 山河总静好，人事也从容
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 敏感词信息表
 * </p>
 *
 * @author itheima
 */
@Data
@TableName("ad_sensitive")
public class AdSensitive implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 敏感词
     */
    @TableField("sensitives")
    private String sensitives;
    /**
     * 创建时间
     */
    @TableField("created_time")
    private Date createdTime;
}