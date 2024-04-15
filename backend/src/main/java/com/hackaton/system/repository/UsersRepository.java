package com.hackaton.system.repository;

import com.hackaton.system.domain.Users;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UsersRepository extends ReactiveMongoRepository<Users, String> {
}
