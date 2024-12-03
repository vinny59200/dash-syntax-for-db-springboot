package com.vv.yaml.controller;

import com.vv.yaml.domain.VvUser;
import com.vv.yaml.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<VvUser> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public VvUser createUser( @RequestBody VvUser vvUser ) {
        return userRepository.save( vvUser );
    }
}
