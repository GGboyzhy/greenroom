package edu.swjtuhc.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.RegisterMapper;
import edu.swjtuhc.demo.model.register;

@Service
public class LoginAndRegisterService {

    @Autowired
    private RegisterMapper RegisterMapper;

    public register addUser(@NonNull register newUser){
        List<register> userList = RegisterMapper.findByUsername(newUser.getUsername());
        if(userList == null|| userList.size()==0){
            //可以注册
            return RegisterMapper.save(newUser);
        }else {
            return null;
        }
    }

}
