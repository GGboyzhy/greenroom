package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Result;
import edu.swjtuhc.demo.model.User;
import edu.swjtuhc.demo.service.LoginService;
import net.sf.json.JSONObject;

@RestController

public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public  Result login(@RequestBody User user) {
//		JSONObject requestMap = new JSONObject();//
		Result result = new Result();
		//调用Service层
		System.out.println(user);
		
		List<User> userList= loginService.findByUsernameAndUserpassword(user.getUsername(),user.getUserpassword());
		if(userList.size()==0){
			result.setResult(false);
			result.setMessage("登陆失败，请检查用户名或密码");
        } else {
        	result.setResult(true);
        	result.setMessage("登陆成功");
        }
		return result;
	}
}
