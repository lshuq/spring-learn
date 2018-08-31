package com.test.controller;

import com.test.service.users.User;
import com.test.service.users.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/users",method = RequestMethod.GET)
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("")
    public List<User> users() {
        return userService.getUsers();
    }

    @RequestMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String id, String name) {
        System.out.println(id+" "+name);
        return userService.ifUserExist(id, name) ? "success" : "error";
    }
}
