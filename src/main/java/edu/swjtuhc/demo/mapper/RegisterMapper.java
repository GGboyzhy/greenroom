package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.swjtuhc.demo.model.User;

public interface RegisterMapper extends JpaRepository<User,Integer>{
	public List<User> findByUsername(String username);
}
