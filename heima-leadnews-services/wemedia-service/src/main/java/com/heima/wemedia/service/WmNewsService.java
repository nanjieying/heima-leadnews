package com.heima.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.wemedia.dtos.WmNewsPageReqDTO;
import com.heima.model.wemedia.pojos.WmNews;

/**
 * WmNewsService
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/29 18:15
 * @say 山河总静好，人事也从容
 */
public interface WmNewsService  extends IService<WmNews> {
    /**
     * 查询所有自媒体文章
     * @return
     */
    public ResponseResult findList(WmNewsPageReqDTO dto);
}