package com.rentbookservice.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rentbookservice.webservice.entity.User;
import com.rentbookservice.webservice.service.UserService;
import com.rentbookservice.webservice.utils.ApiResponse;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ApiResponse<User> createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

}
