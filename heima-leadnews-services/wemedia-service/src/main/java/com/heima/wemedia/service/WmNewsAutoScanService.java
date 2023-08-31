package com.heima.wemedia.service;

/**
 * WmNewsAutoScanService
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/30 16:39
 * @say 山河总静好，人事也从容
 */
public interface WmNewsAutoScanService {
    /**
     * 自媒体文章审核
     * @param id  自媒体文章id
     */
    public void autoScanWmNews(Integer id);
}