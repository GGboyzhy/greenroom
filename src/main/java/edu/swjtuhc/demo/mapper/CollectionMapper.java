package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.CollectionModel;

@Mapper
public interface CollectionMapper {
	public List<CollectionModel> selectAllCollection();
}
