package edu.swjtuhc.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Result;
import edu.swjtuhc.demo.model.User;
import edu.swjtuhc.demo.service.RegisterService;

@RestController
public class RegisterController {

    @Autowired
    private RegisterService RegisterService;

    @PostMapping(value = "/register" )
    public Result addUser(@RequestBody User newUser){
        Result result = new Result();  
        User user = RegisterService.addUser(newUser);
        if(user == null){
            //表示注册失败
            result.setResult(false);
            result.setMessage("用户名已被注册");
        }else {
            result.setResult(true);
            result.setMessage("注册成功");
        }
        return result;
    }
}
