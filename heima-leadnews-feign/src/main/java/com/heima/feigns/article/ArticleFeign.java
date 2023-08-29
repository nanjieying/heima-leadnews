package com.heima.feigns.article;

import com.heima.config.HeimaFeignAutoConfiguration;
import com.heima.feigns.fallback.ArticleFeignFallback;
import com.heima.model.article.pojos.ApAuthor;
import com.heima.model.common.dtos.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * ArticleFeign
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/18 15:19
 * @say 山河总静好，人事也从容
 */
@FeignClient(value = "leadnews-article",
        fallbackFactory = ArticleFeignFallback.class,
        configuration = HeimaFeignAutoConfiguration.class
)
public interface ArticleFeign {
    @GetMapping("/api/v1/author/findByUserId/{userId}")
    ResponseResult<ApAuthor> findByUserId(@PathVariable("userId") Integer userId);
    @PostMapping("/api/v1/author/save")
    ResponseResult save(@RequestBody ApAuthor apAuthor);
}