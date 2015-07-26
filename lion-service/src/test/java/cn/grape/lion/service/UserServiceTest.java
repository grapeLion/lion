package cn.grape.lion.service;

import cn.grape.lion.domain.User;
import cn.grape.lion.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Emily on 15/7/25.
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml","classpath:spring/spring-mybatis.xml"})
public class UserServiceTest {
    @Autowired
    UserServiceImpl userService;
    @Test
    public void userTest(){
        List<User> list = userService.findAll();
        System.out.println(list);





    }

}
