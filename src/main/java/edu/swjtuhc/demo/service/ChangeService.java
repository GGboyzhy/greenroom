package edu.swjtuhc.demo.service;

import edu.swjtuhc.demo.model.ChangeModel;

public interface ChangeService {
	public  int ChangeName(ChangeModel changeName) ;
	public   void SelectUserByName(ChangeModel changeName);
}
