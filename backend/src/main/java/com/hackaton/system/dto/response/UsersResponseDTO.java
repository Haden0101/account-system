package com.hackaton.system.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsersResponseDTO {

    private String name;

    private String email;

    private Integer age;

    private String user_role;

}
