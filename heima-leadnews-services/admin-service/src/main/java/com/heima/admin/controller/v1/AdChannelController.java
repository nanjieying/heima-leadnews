package com.heima.admin.controller.v1;

import com.heima.admin.service.AdChannelService;
import com.heima.model.admin.dtos.ChannelDTO;
import com.heima.model.admin.pojos.AdChannel;
import com.heima.model.common.dtos.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * AdChannelController
 *
 * @author njy
 * @version 1.0
 * @description 频道控制层
 * @date 2023/8/16 16:47
 * @say 山河总静好，人事也从容
 */
@RestController
@RequestMapping("/api/v1/channel")
@Api(value = "频道管理", tags = "频道管理", description = "频道管理API")
public class AdChannelController {
    @Autowired
    private AdChannelService channelService;


    @PostMapping("/list")
    @ApiOperation("频道分页列表查询")
    public ResponseResult findByNameAndPage(@RequestBody ChannelDTO dto) {
        return channelService.findByNameAndPage(dto);
    }

    @ApiOperation("频道新增")
    @PostMapping("/save")
    public ResponseResult insert(@RequestBody AdChannel channel) {
        return channelService.insert(channel);
    }

    @ApiOperation("频道修改")
    @PostMapping("/update")
    public ResponseResult update(@RequestBody AdChannel adChannel) {
        return channelService.update(adChannel);
    }

    @ApiOperation("根据频道ID删除")
    @GetMapping("/del/{id}")
    public ResponseResult deleteById(@PathVariable("id") Integer id) {
        return channelService.deleteById(id);
    }

    @ApiOperation("查询全部频道")
    @GetMapping("/channels")
    public ResponseResult findAll() {
        List<AdChannel> list = channelService.list();
        return ResponseResult.okResult(list);
    }

    @ApiOperation("根据id查询频道")
    @GetMapping("/one/{id}")
    public ResponseResult findOne(@PathVariable Integer id) {
        return ResponseResult.okResult(channelService.getById(id));
    }
}