package com.wtrue.sprica.service.impl;

import com.wtrue.sprica.service.IUserBiz;
import com.wtrue.sprica.service.IUserService;
import com.wtrue.sprica.service.dto.UserDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/3/15 1:55 PM
 */
@Service("userBiz")
public class UserBizImpl implements IUserBiz {

    @Resource
    private IUserService userService;

    @Override
    public Integer add(UserDto dto) {
        return userService.add(dto);
    }
}
