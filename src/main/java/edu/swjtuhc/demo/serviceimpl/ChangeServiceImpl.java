package edu.swjtuhc.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.ChangeMapper;
import edu.swjtuhc.demo.model.ChangeModel;
import edu.swjtuhc.demo.service.ChangeService;

@Service
public  class ChangeServiceImpl implements ChangeService{
	
	@Autowired
	ChangeMapper changemapper;
	@Override
	public int ChangeName(ChangeModel changeName) {
		// TODO Auto-generated method stub
		ChangeModel  c1 =changemapper.SelectUserByName(changeName.getName());
		System.out.println(changeName);
		int i = -1;
		if(c1==null) {
			i = changemapper.insertUser(changeName);
			System.out.println(changeName);
		}
		return i;
		
	}

	@Override
	public void SelectUserByName(ChangeModel changeName) {
		// TODO Auto-generated method stub
		System.out.println(changeName);
	}

}
