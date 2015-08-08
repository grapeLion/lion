package cn.grape.lion.service;

import cn.grape.lion.domain.User;
import cn.grape.lion.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Created by Emily on 15/7/25.
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml","classpath:xmlfile/spring-mybatis.xml"})
public class UserServiceTest {
    @Autowired
    private UserServiceImpl userService;


    @Test
    public void test1() throws Exception{
        Class clazz = User.class;
       List<User> list = userService.findUserByName("zhang", 1, 5);
        for (User user:list){
            Field[] fields = clazz.getDeclaredFields();
            for (Field field :fields){
                field.setAccessible(true);
                System.out.println(field.getName());
                System.out.println(field.get(user));
            }
            System.out.println(list);
        }
    }

}
