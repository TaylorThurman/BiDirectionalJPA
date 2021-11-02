package com.notyfyd.service;

import com.notyfyd.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<Object> findAllUsers() {
        return ResponseEntity.ok(userRepository.findAll());
    }
}
