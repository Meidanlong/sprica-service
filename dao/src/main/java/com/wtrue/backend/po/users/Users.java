package com.wtrue.backend.po.users;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(name = "users")
public class Users {
    @Id
    private String username;

    private String password;

    private Boolean enabled;
}