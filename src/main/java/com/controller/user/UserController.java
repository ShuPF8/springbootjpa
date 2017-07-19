package com.controller.user;

import com.alibaba.fastjson.JSON;
import com.entity.UserEntity;
import com.service.UserService;
import com.utils.BaseUtils;
import com.utils.ResultJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
@RestController
public class UserController extends BaseUtils{

    @Autowired private UserService userService;

    @RequestMapping("/findbyid")
    @ResponseBody
    public void findID(){
        ResultJson result = userService.findById(1l);
        backClient(JSON.toJSONString(result));
    }

    @RequestMapping("/findbyIdAndAge")
    @ResponseBody
    public void findbyIdAndAge(){
        ResultJson result = userService.fingByIdAndAge(2l,22);;
        backClient(JSON.toJSONString(result));
    }


    @RequestMapping("/findAll")
    @ResponseBody
    public void findAll(){
        ResultJson result = userService.findAll();
        backClient(JSON.toJSONString(result));
    }

    @RequestMapping("/save")
    @ResponseBody
    public void save(){
        UserEntity u = new UserEntity();
        u.setAge(24);
        u.setName("大娃");
        u.setPhone("12345678998");
        u.setPwd("123789");
        u.setSex("男");
      userService.save(u);
    }

    @RequestMapping("/delByid")
    @ResponseBody
    public void del(){
       userService.deleteById(1l);
    }
    @RequestMapping("/delByObj")
    @ResponseBody
    public void delByObj(){
        ResultJson u = userService.findById(2l);
        UserEntity userEntity = (UserEntity) u.getData();
        userService.deleteByObject(userEntity);
    }

}
