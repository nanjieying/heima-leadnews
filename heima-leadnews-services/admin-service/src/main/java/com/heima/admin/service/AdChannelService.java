package com.heima.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.admin.dtos.ChannelDTO;
import com.heima.model.admin.pojos.AdChannel;
import com.heima.model.common.dtos.ResponseResult;

/**
 * AdChannelService
 *
 * @author njy
 * @version 1.0
 * @description 频道接口类
 * @date 2023/8/16 16:44
 * @say 山河总静好，人事也从容
 */
public interface AdChannelService extends IService<AdChannel> {
    /**
     * 根据名称分页查询频道列表
     * @param dto
     * @return
     */
    public ResponseResult findByNameAndPage(ChannelDTO dto);
}