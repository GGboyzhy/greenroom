package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.ChangeModel;
import edu.swjtuhc.demo.service.ChangeService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/Change")
public class ChangeController {
	
	@Autowired
	ChangeService ChangeService;
//  修改密码
@RequestMapping("/ChangePassword")
public JSONObject Change(@RequestBody ChangeModel changemodel) {
	System.out.println(changemodel);
	JSONObject requesMap = new JSONObject();
	
	int i = ChangeService.Change(changemodel);
	System.out.println(changemodel);
	requesMap.put("state",i);
	return requesMap;
	}
}
