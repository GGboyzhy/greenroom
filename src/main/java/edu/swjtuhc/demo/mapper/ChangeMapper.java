package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.ChangeModel;

@Mapper
public interface ChangeMapper {
	public ChangeModel SelectUserByName(String name);
	public int ChangeName (ChangeModel name);
	public int insertUser(ChangeModel changeName);
}
