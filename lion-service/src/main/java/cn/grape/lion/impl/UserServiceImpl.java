package cn.grape.lion.impl;

import cn.grape.lion.domain.User;
import cn.grape.lion.mapper.UserMapper;
import cn.grape.lion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Emily on 15/7/25.
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public List<User> getUserList() {
        return userMapper.findAll();
    }
}
