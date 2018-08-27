package com.test.service.users;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public List<User> getUsers() {
        return userMapper.selectByExample(new UserExample());
    }
}
