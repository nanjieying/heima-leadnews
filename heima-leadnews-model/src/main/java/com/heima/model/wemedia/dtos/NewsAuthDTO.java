package com.heima.model.wemedia.dtos;

import com.heima.model.common.dtos.PageRequestDTO;
import lombok.Data;

/**
 * NewsAuthDTO
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/30 17:05
 * @say 山河总静好，人事也从容
 */
@Data
public class NewsAuthDTO extends PageRequestDTO {
    /**
     * 文章标题
     */
    private String title;
    /**
     * 状态
     */
    private Short status;
    /**
     * 文章id
     */
    private Integer id;

    /**
     * 失败原因
     */
    private String msg;
}