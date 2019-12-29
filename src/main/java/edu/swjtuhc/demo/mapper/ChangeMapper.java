package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import edu.swjtuhc.demo.model.ChangeModel;

@Mapper
public interface ChangeMapper {
		int ChangePassword(ChangeModel changemodel);
}
