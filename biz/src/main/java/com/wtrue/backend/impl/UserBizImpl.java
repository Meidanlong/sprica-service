package com.wtrue.backend.impl;

import com.wtrue.backend.IUserBiz;
import com.wtrue.backend.IUserService;
import com.wtrue.backend.dto.UserDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.naming.Name;

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
