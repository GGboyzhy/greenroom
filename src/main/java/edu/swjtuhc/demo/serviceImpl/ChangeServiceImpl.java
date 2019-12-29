package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.ChangeMapper;
import edu.swjtuhc.demo.model.ChangeModel;
import edu.swjtuhc.demo.service.ChangeService;

@Service
public class ChangeServiceImpl implements ChangeService{
	@Autowired
	ChangeMapper changeMapper;

	@Override
	public int Change(ChangeModel changemodel) {
		// TODO Auto-generated method stub
		int i = changeMapper.ChangePassword(changemodel);
		return i;
	}
}
