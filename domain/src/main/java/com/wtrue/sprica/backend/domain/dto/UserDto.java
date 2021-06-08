package com.wtrue.sprica.backend.domain.dto;

import com.wtrue.sprica.common.domain.BaseObject;
import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/3/15 2:03 PM
 */
@Data
public class UserDto extends BaseObject {

    private Integer id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 身份证号
     */
    private String idNum;

    /**
     * 微信ID
     */
    private String wxId;

    /**
     * 支付宝ID
     */
    private String zfbId;
}
