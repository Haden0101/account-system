package com.hackaton.system.controller;

import com.hackaton.system.dto.response.UsersResponseDTO;
import com.hackaton.system.dto.response.custonResponse.CustomResponseEntity;
import com.hackaton.system.service.UsersService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping("/findAll")
    public ResponseEntity<Mono<List<UsersResponseDTO>>> getUsers() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(usersService.findAllUsers());
    }


}
