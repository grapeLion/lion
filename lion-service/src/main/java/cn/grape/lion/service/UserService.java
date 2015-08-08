package cn.grape.lion.service;

import cn.grape.lion.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Emily on 15/7/25.
 */
public interface UserService {

    User getUserById(Integer id);

    List<User> getUserList();

    int addUser(User user);

    int findAllRows();

    List<User> findAllUserByPage(int page,int rows);

    List<User> findUserByName(String username,int page,int rows);
}

