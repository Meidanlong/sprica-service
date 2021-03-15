package com.wtrue.backend.model;

import com.wtrue.backend.feign.ModelServer;
import com.wtrue.backend.request.UserAddReq;
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
@RestController
@RequestMapping("/user/")
public class UserController {

    @Resource
    private ModelServer modelServer;

    @PostMapping("add")
    public String add(@RequestBody UserAddReq req){

        return modelServer.add(req);
    }
}
