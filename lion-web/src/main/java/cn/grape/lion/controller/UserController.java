package cn.grape.lion.controller;

import cn.grape.lion.domain.User;
import cn.grape.lion.impl.UserServiceImpl;
import cn.grape.lion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
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
        return null;
    }

    @RequestMapping(value = "index")
    public ModelAndView toIndex(){
        Map<String,Object> map = new HashMap<String, Object>();
        User user =  userService.getUserById(1);
        map.put("user",user);
        return new ModelAndView("index",map) ;
    }

}
