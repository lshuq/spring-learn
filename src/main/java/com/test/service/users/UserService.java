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

    public User getUserById(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public Boolean ifUserExist(String id, String name) {
        UserExample userExample = new UserExample();
        userExample.or().andIdEqualTo(id).andNameEqualTo(name);
        return userMapper.countByExample(userExample) != 0;
    }
}
