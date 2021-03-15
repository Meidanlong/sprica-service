package com.wtrue.backend.request;

import lombok.Data;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/3/15 1:58 PM
 */
@Data
public class UserAddReq {

    private String userName;

    private String phone;

    private String idNum;
}
