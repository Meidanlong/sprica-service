package com.wtrue.usercenter.biz.impl;

import com.wtrue.usercenter.biz.IUserBiz;
import com.wtrue.usercenter.domain.dto.UserDto;
import com.wtrue.usercenter.service.IUserService;
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
