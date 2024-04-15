package com.hackaton.system.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class Users {

    @Id
    private String id;

    private String name;

    private String email;

    private Integer age;

    private String password;

    private String user_role;

}
