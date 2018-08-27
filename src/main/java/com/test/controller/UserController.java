package com.test.controller;

import com.test.service.users.User;
import com.test.service.users.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/users")
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
    public String login(@RequestParam(value = "id") String id, @RequestParam(value = "name") String name) {
        return userService.ifUserExist(id, name) ? "success" : "error";
    }
}
