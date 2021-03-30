package com.wtrue.sprica.service.impl;

import com.wtrue.sprica.service.IUserService;
import com.wtrue.sprica.service.adapter.UserAdapter;
import com.wtrue.sprica.service.dao.users.UsersMapper;
import com.wtrue.sprica.service.dto.UserDto;
import com.wtrue.sprica.service.po.users.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/3/15 1:49 PM
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private UsersMapper usersMapper;

    @Override
    public Integer add(UserDto dto) {
        Users users = UserAdapter.dtoToPo(dto);
        return usersMapper.insertSelective(users);
    }
}
