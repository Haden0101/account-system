package com.hackaton.system.service;

import com.hackaton.system.dto.response.UsersResponseDTO;
import com.hackaton.system.repository.UsersRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    UsersRepository usersRepository;

    public Mono<List<UsersResponseDTO>> findAllUsers() {
        ModelMapper modelMapper = new ModelMapper();
        return usersRepository.findAll()
                .map(item -> modelMapper.map(item, UsersResponseDTO.class))
                .collectList();
    }

}
