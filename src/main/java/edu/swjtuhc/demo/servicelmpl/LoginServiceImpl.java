package edu.swjtuhc.demo.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.LoginMapper;
import edu.swjtuhc.demo.model.User;
import edu.swjtuhc.demo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginMapper loginMapper;
	
	@Override
    public List<User> findByUsernameAndUserpassword(String username, String userpassword) {
        return loginMapper.findByUsernameAndUserpassword(username,userpassword);
    }
	
}
