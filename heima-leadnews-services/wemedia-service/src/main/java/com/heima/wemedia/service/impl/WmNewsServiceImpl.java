package com.heima.wemedia.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heima.common.exception.CustException;
import com.heima.model.common.dtos.PageResponseResult;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.common.enums.AppHttpCodeEnum;
import com.heima.model.threadlocal.WmThreadLocalUtils;
import com.heima.model.wemedia.dtos.WmNewsPageReqDTO;
import com.heima.model.wemedia.pojos.WmNews;
import com.heima.model.wemedia.pojos.WmUser;
import com.heima.wemedia.mapper.WmNewsMapper;
import com.heima.wemedia.service.WmNewsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * WmNewsServiceImpl
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/29 18:16
 * @say 山河总静好，人事也从容
 */
@Service
public class WmNewsServiceImpl extends ServiceImpl<WmNewsMapper, WmNews> implements WmNewsService {
    @Value("${file.oss.web-site}")
    String webSite;
    /**
     * 查询所有自媒体文章
     * @param dto
     * @return
     */
    @Override
    public ResponseResult findList(WmNewsPageReqDTO dto) {
        //1 参数检查
        if (dto == null) {
            return ResponseResult.errorResult(AppHttpCodeEnum.PARAM_INVALID);
        }
        dto.checkParam();
        //2 条件封装执行查询
        LambdaQueryWrapper<WmNews> wrapper = new LambdaQueryWrapper<>();
        // 文章标题模糊查询
        wrapper.like(StringUtils.isNotBlank(dto.getKeyword()),WmNews::getTitle, dto.getKeyword());
        // 频道id
        wrapper.eq(dto.getChannelId() != null,WmNews::getChannelId, dto.getChannelId());
        // 文章状态
        wrapper.eq(dto.getStatus() != null,WmNews::getStatus, dto.getStatus());
        // 发布时间 >= 开始时间
        wrapper.ge(dto.getBeginPubDate() != null,WmNews::getPublishTime, dto.getBeginPubDate());
        // 发布时间 <= 开始时间
        wrapper.le(dto.getEndPubDate()!=null,WmNews::getPublishTime, dto.getBeginPubDate());
        // 当前自媒体人文章
        WmUser user = WmThreadLocalUtils.getUser();
        if (user == null) {
            CustException.cust(AppHttpCodeEnum.NEED_LOGIN);
        }
        wrapper.eq(WmNews::getUserId, user.getId());
        // 按照创建日期倒序
        wrapper.orderByDesc(WmNews::getCreatedTime);
        // 分页条件构建
        Page<WmNews> page = new Page<>(dto.getPage(), dto.getSize());
        //3 执行查询
        IPage<WmNews> pageResult = page(page, wrapper);
        //4 返回封装查询结果
        PageResponseResult result = new PageResponseResult(dto.getPage(), dto.getSize(), pageResult.getTotal());
        result.setData(pageResult.getRecords());
        // 处理文章图片
        result.setHost(webSite);
        return result;
    }
}