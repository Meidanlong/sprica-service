package com.wtrue.backend.po.users;

import java.util.Date;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(name = "users")
public class Users {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 用户ID
     */
    @Column(name = "USER_ID")
    private String userId;

    /**
     * 用户名称
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 手机号
     */
    @Column(name = "PHONE")
    private String phone;

    /**
     * 身份证号
     */
    @Column(name = "ID_NUM")
    private String idNum;

    /**
     * 微信ID
     */
    @Column(name = "WX_ID")
    private String wxId;

    /**
     * 支付宝ID
     */
    @Column(name = "ZFB_ID")
    private String zfbId;

    /**
     * 是否删除
     */
    @Column(name = "DELETED")
    private String deleted;

    /**
     * 创建时间
     */
    @Column(name = "CREATED_TIME")
    private Date createdTime;

    /**
     * 更新时间
     */
    @Column(name = "UPDATED_TIME")
    private Date updatedTime;
}