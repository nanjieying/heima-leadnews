package com.heima.wemedia.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heima.model.wemedia.pojos.WmMaterial;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * WmMaterialMapper
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/28 22:42
 * @say 山河总静好，人事也从容
 */
public interface WmMaterialMapper extends BaseMapper<WmMaterial> {
    /**
     * 根据素材资源路径，查询相关素材id
     * @param urls 素材路径
     * @param userId
     * @return
     */
    public List<Integer> selectRelationsIds(@Param("urls") List<String> urls,
                                            @Param("userId") Integer userId);
}