package com.wtrue.sprica.backend.service.impl;

import com.wtrue.sprica.backend.dao.dao.users.UsersMapper;
import com.wtrue.sprica.backend.dao.po.users.Users;
import com.wtrue.sprica.backend.domain.adapter.UserAdapter;
import com.wtrue.sprica.backend.domain.dto.UserDto;
import com.wtrue.sprica.backend.service.IUserService;
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
