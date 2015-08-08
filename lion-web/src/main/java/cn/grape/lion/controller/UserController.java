package cn.grape.lion.controller;

import cn.grape.lion.annotation.FastJson;
import cn.grape.lion.domain.User;
import cn.grape.lion.domain.VerResult;
import cn.grape.lion.domain.VerificationVo;
import cn.grape.lion.impl.UserServiceImpl;
import cn.grape.lion.page.UserPage;
import cn.grape.lion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by solis on 2015/8/1.
 */
@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @Value(value = "${localHost}")
    private String localHost;

    @RequestMapping(value = "to_user_list")
    public ModelAndView getUserById(){
//        Map<String,Object> map = new HashMap<String, Object>();
//        User user =  userServiceImpl.getUserById(1);
//        map.put("user",user);
//        return new ModelAndView("user_list",map) ;
        return new ModelAndView("user_list");
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
    public UserPage getUserList(@RequestParam(value = "page")int page, @RequestParam(value = "rows") int rows){
        int currentPage = (page-1)*rows;
        List<User> list =  userService.findAllUserByPage(currentPage,rows);
        int total = userService.findAllRows();
        UserPage userPage = new UserPage();
        userPage.setTotal(total);
        userPage.setRows(list);
        return userPage;
    }


    @RequestMapping(value = "adduser")
    public void addUser(VerificationVo verificationVo){
        Map<String,VerResult> map = verificationVo.getVerResultMap();
        if (!map.isEmpty()){
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()){
                String key = it.next();
                map.get(key).setQuestionCode(key);
            }
        };




    }

    @RequestMapping(value = "addUser")
    public void addAjaxUser(@FastJson User user){
        System.out.println(localHost);
        userService.addUser(user);
    }
}
