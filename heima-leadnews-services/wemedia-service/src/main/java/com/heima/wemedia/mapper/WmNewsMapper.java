package com.heima.wemedia.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heima.model.wemedia.pojos.WmNews;
import com.heima.model.wemedia.dtos.NewsAuthDTO;
import com.heima.model.wemedia.vo.WmNewsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * WmNewsMapper
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/29 18:14
 * @say 山河总静好，人事也从容
 */
public interface WmNewsMapper extends BaseMapper<WmNews> {
    List<WmNewsVO> findListAndPage(@Param("dto") NewsAuthDTO dto);
    long findListCount(@Param("dto") NewsAuthDTO dto);
}