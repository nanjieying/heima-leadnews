package com.heima.model.admin.dtos;

import com.heima.model.common.dtos.PageRequestDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * ChannelDTO
 *
 * @author njy
 * @version 1.0
 * @description 频道视图
 * @date 2023/8/16 16:41
 * @say 山河总静好，人事也从容
 */
@Data
public class ChannelDTO extends PageRequestDTO {
    /**
     * 频道名称
     */
    @ApiModelProperty("频道名称")
    private String name;
    /**
     * 频道状态
     */
    @ApiModelProperty("频道状态")
    private Integer status;
}