package com.hackaton.system.dto.request;

import lombok.Data;

@Data
public class UsersRequestDTO {

    private String name;

    private String email;

    private Integer age;

    private String password;

    private String user_role;

}
