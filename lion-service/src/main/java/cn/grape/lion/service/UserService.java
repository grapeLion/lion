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
}

