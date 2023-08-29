package com.heima.article.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heima.article.mapper.AuthorMapper;
import com.heima.article.service.AuthorService;
import com.heima.model.article.pojos.ApAuthor;
import org.springframework.stereotype.Service;

/**
 * AuthorServiceImpl
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/18 15:12
 * @say 山河总静好，人事也从容
 */
@Service
public class AuthorServiceImpl extends ServiceImpl<AuthorMapper, ApAuthor> implements AuthorService {
}