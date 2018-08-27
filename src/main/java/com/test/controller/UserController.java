package com.test.controller;

import com.test.service.users.User;
import com.test.service.users.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/users")
    public List<User> users(){
        return userService.getUsers();
    }
}
