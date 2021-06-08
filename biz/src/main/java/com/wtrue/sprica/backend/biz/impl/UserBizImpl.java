package com.wtrue.sprica.backend.biz.impl;

import com.wtrue.sprica.backend.biz.IUserBiz;
import com.wtrue.sprica.backend.domain.dto.UserDto;
import com.wtrue.sprica.backend.service.IUserService;
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
