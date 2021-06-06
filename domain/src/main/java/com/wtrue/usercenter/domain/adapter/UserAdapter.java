package com.wtrue.usercenter.domain.adapter;

import com.wtrue.usercenter.domain.dto.UserDto;
import com.wtrue.sprica.service.po.users.Users;
import com.wtrue.sprica.service.request.UserAddReq;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/3/15 2:05 PM
 */
public class UserAdapter {

    public static UserDto addReqToDto(UserAddReq req){
        if (req == null){
            return null;
        }

        UserDto dto = new UserDto();
        dto.setUserName(req.getUserName());
        dto.setIdNum(req.getIdNum());
        dto.setPhone(req.getPhone());

        return dto;
    }

    public static Users dtoToPo(UserDto dto){
        if(dto == null){
            return null;
        }

        Users users = new Users();
        users.setUserId(dto.getUserId());
        users.setUserName(dto.getUserName());
        users.setIdNum(dto.getIdNum());
        users.setPhone(dto.getPhone());
        users.setWxId(dto.getWxId());
        users.setZfbId(dto.getZfbId());

        return users;
    }
}
