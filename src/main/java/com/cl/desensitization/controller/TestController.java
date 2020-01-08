package com.cl.desensitization.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cl.desensitization.entity.User;
import com.cl.desensitization.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenling
 * @date 2020/1/7 20:12
 * @since V1.0.0
 */
@RestController
public class TestController {

    @Autowired
    private TestService testServiceImpl;


    @GetMapping("/get")
    public String   query(){
        List<User> list = testServiceImpl.list();
        return JSONObject.toJSONString(list);

    }

    @PostMapping("/add")
    public boolean  insert( @RequestBody  User  user){
        return  testServiceImpl.save(user);
    }




    @GetMapping("/getOne")
    public User getOne(Integer id){
        LambdaQueryWrapper<User> lambda = new QueryWrapper<User>().lambda();
        lambda.select(User::getPassword).eq(User::getId,id);
         return testServiceImpl.getOne(lambda);
    }


    @GetMapping("/find")
    public User getOneByPwd(Integer id,String passsword){
        LambdaQueryWrapper<User> lambda = new QueryWrapper<User>().lambda();
        lambda.select(User::getPassword).eq(User::getId,id).eq(User::getPassword,passsword);
        return testServiceImpl.getOne(lambda);
    }

}
