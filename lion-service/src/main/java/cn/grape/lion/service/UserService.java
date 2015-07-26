package cn.grape.lion.service;

import cn.grape.lion.domain.User;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.List;

/**
 * Created by Emily on 15/7/25.
 */
public interface UserService {

    List<User> findAll();
}

