package cn.grape.lion.service;

import cn.grape.lion.domain.User;
import org.springframework.stereotype.Service;

/**
 * Created by Emily on 15/7/25.
 */
public interface UserService {

    User getUserById(Integer id);
}

