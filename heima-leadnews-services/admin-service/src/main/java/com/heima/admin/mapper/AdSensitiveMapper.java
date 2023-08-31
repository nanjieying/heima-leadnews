package com.heima.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heima.model.admin.pojos.AdSensitive;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * AdSensitiveMapper
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/17 17:49
 * @say 山河总静好，人事也从容
 */
public interface AdSensitiveMapper extends BaseMapper<AdSensitive> {
    @Select("select sensitives from ad_sensitive")
    List<String> findAllSensitives();
}