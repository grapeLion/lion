package cn.grape.lion.controller;

import cn.grape.lion.annotation.FastJson;
import cn.grape.lion.domain.User;
import cn.grape.lion.impl.UserServiceImpl;
import cn.grape.lion.page.UserPage;
import cn.grape.lion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by solis on 2015/8/1.
 */
@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "user_list")
    public ModelAndView getUserById(Integer id){
//        Map<String,Object> map = new HashMap<String, Object>();
//        User user =  userServiceImpl.getUserById(1);
//        map.put("user",user);
//        return new ModelAndView("user_list",map) ;
        return new ModelAndView("index");
    }

//    @RequestMapping(value = "index")
//    public ModelAndView toIndex(){
//        Map<String,Object> map = new HashMap<String, Object>();
//        User user =  userService.getUserById(1);
//        map.put("user",user);
//        return new ModelAndView("index",map) ;
//    }

    @RequestMapping(value = "index")
    @ResponseBody
    public User getUser(){
        User user =  userService.getUserById(1);
        return user ;
    }

    @RequestMapping(value = "users")
    @ResponseBody
    public UserPage getUserList(){
        List<User> list =  userService.getUserList();
        UserPage userPage = new UserPage();
        userPage.setTotal(list.size());
        userPage.setRows(list);
        return userPage;
    }


    @RequestMapping(value = "adduser")
    public void addUser(@FastJson User user){
        System.out.println(user);
    }
}
