package com.wtrue.backend.request;

import com.wtrue.sprica.common.domain.BaseObject;
import lombok.Data;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/3/15 1:58 PM
 */
@Data
public class UserAddReq extends BaseObject {

    private String userName;

    private String phone;

    private String idNum;
}
