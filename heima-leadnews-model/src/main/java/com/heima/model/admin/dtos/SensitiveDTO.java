package com.heima.model.admin.dtos;

import com.heima.model.common.dtos.PageRequestDTO;
import lombok.Data;

/**
 * SensitiveDto
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/17 17:47
 * @say 山河总静好，人事也从容
 */
@Data
public class SensitiveDTO extends PageRequestDTO {
    /**
     * 敏感词名称
     */
    private String name;
}