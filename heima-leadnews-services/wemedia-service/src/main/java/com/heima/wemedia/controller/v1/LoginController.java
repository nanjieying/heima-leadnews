package com.heima.wemedia.controller.v1;

import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.wemedia.dtos.WmUserDTO;
import com.heima.wemedia.service.WmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * LoginController
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/25 17:59
 * @say 山河总静好，人事也从容
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private WmUserService wmUserService;
    @PostMapping("/in")
    public ResponseResult login(@RequestBody WmUserDTO dto){
        return wmUserService.login(dto);
    }
}