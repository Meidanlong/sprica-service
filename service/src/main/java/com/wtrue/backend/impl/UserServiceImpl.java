package com.wtrue.backend.impl;

import com.wtrue.backend.IUserService;
import com.wtrue.backend.adapter.UserAdapter;
import com.wtrue.backend.dao.users.UsersMapper;
import com.wtrue.backend.dto.UserDto;
import com.wtrue.backend.po.users.Users;
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
