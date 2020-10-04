package com.cloud.study.controller;

import com.cloud.study.entity.User;
import com.cloud.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private Registration registration;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        Optional<User> user = this.userRepository.findById(id);
        return user.get();
    }
    @GetMapping("/getIpAndPort")
    public String findById() {
        return registration.getHost()+" ; "+registration.getPort();
    }

//    @PostMapping("/saveUser")
//    public void saveUser() {
//        restTemplate.han
//    }
}
