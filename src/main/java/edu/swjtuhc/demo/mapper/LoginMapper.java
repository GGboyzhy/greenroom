package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import edu.swjtuhc.demo.model.User;

@Mapper
public interface LoginMapper extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User>{
	
    List<User> findByUsernameAndUserpassword(String username, String userpassword);
}
