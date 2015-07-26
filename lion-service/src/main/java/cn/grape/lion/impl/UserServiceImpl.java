package cn.grape.lion.impl;

import cn.grape.lion.domain.User;
import cn.grape.lion.mapper.UserMapper;
import cn.grape.lion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Emily on 15/7/25.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        List<User> users = userMapper.findAll();
        return users;
    }
}
