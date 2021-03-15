package com.wtrue.backend.model;

import com.wtrue.backend.IUserBiz;
import com.wtrue.backend.IUserService;
import com.wtrue.backend.request.UserAddReq;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/3/12 6:05 PM
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserBiz userBiz;

    @PostMapping("/add")
    public String add(@RequestBody UserAddReq req){

        String userId = UUID.randomUUID().toString().replace("-", "").toLowerCase();

        return "success";
    }
}
