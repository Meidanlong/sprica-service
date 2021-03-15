package com.wtrue.backend.impl;

import com.wtrue.backend.IUserBiz;
import com.wtrue.backend.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/3/15 1:55 PM
 */
@Service
public class UserBizImpl implements IUserBiz {

    @Resource
    private IUserService userService;

    @Override
    public void add() {
        userService.add();
        return;
    }
}
