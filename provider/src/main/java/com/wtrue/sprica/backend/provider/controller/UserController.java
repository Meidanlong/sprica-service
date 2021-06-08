package com.wtrue.sprica.backend.provider.controller;

import com.wtrue.sprica.common.utils.ValidUtil;
import com.wtrue.sprica.backend.biz.IUserBiz;
import com.wtrue.sprica.backend.domain.adapter.UserAdapter;
import com.wtrue.sprica.backend.domain.dto.UserDto;
import com.wtrue.sprica.backend.export.request.UserAddReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/3/12 6:05 PM
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    @Resource
    private IUserBiz userBiz;

    @PostMapping("add")
    public String add(@RequestBody UserAddReq req){

        ValidUtil valid = new ValidUtil()
                .notNull("request", req)
                .notNull("userName", req.getUserName())
                .notNull("phone", req.getPhone());
        if(!valid.isValid()){
            return "wrong - " + valid.getMsg();
        }

        UserDto dto = UserAdapter.addReqToDto(req);
        String userId = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        dto.setUserId(userId);
        Integer count = userBiz.add(dto);

        return count > 0 ? "success" : "failed";
    }
}
