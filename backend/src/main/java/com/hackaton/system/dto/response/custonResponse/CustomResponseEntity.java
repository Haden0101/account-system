package com.hackaton.system.dto.response.custonResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomResponseEntity<T> {

    private boolean status;
    private String message;
    private T data;

}
