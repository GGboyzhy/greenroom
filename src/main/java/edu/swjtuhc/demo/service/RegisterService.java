package edu.swjtuhc.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.RegisterMapper;
import edu.swjtuhc.demo.model.Result;
import edu.swjtuhc.demo.model.User;

@Service
public class RegisterService {

    @Autowired
    private RegisterMapper RegisterMapper;



    public User addUser(@NonNull User newUser){
        List<User> userList = RegisterMapper.findByUsername(newUser.getUsername());
        if(userList == null|| userList.size()==0){
            //可以注册
            return RegisterMapper.save(newUser);
        }else {
            return null;
        }
    }
}
