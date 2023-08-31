package com.heima.model.wemedia.vo;

import com.heima.model.wemedia.pojos.WmNews;
import lombok.Data;

/**
 * WmNewsVO
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/30 17:03
 * @say 山河总静好，人事也从容
 */
@Data
public class WmNewsVO  extends WmNews {
    /**
     * 作者名称
     */
    private String authorName;
}