package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.User;

public interface LoginService {
	List<User> findByUsernameAndUserpassword(String username ,String userpassword);
}
