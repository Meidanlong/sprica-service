package com.wtrue.sprica.service.controller;

import com.wtrue.sprica.service.feign.service.ModelService;
import com.wtrue.sprica.service.request.UserAddReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/3/15 9:50 PM
 */
@Api(value="用户")
@RestController
@RequestMapping("/user/")
public class UserController {

    @Resource
    private ModelService modelService;

    @PostMapping("add")
    @ApiOperation(value = "添加用户", notes = "添加用户", tags = { "用户模块" }, httpMethod = "POST", response = String.class)
    public String add(@RequestBody UserAddReq req){

        return modelService.add(req);
    }
}
