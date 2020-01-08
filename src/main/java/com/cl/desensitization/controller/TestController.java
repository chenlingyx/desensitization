package com.cl.desensitization.controller;

import com.alibaba.fastjson.JSONObject;
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

}
