package com.tech.controller;

import com.tech.model.Address;
import com.tech.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final RestTemplate restTemplate;

    @GetMapping
    public User getUser() {
        User user = new User();
        user.setName("John");

        ResponseEntity<Address> forEntity = restTemplate.getForEntity("http://address-service:8082/address", Address.class);
        user.setAddress(forEntity.getBody());
        return user;
    }
}
