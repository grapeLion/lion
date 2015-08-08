package cn.grape.lion.impl;

import cn.grape.lion.domain.User;
import cn.grape.lion.mapper.UserMapper;
import cn.grape.lion.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Emily on 15/7/25.
 */
@Service
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


    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int findAllRows() {
        return userMapper.findAllRows();
    }

    @Override
    public List<User> findAllUserByPage(int page,int rows) {
        return userMapper.findAllByPage(page,rows);
    }

    @Override
    public List<User> findUserByName(String username, int page, int rows) {
        return userMapper.findUserByName(username,page,rows);
    }
}
