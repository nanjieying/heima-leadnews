package com.heima.model.wemedia.dtos;

import com.heima.model.common.dtos.PageRequestDTO;
import lombok.Data;

/**
 * WmMaterialDTO
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/29 16:09
 * @say 山河总静好，人事也从容
 */
@Data
public class WmMaterialDTO extends PageRequestDTO {
    Short isCollection; //1 查询收藏的   0: 未收藏
}