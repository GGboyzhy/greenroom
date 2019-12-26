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
	ChangeService changeservice;
	
	@RequestMapping("/ChangeName")
	public JSONObject Change(@RequestBody ChangeModel ChangeName) {
		System.out.println(ChangeName);
		JSONObject result = new JSONObject();
		//service
		int i = changeservice.ChangeName(ChangeName);
		System.out.println(ChangeName);
//		result.put("state", 1);
		return result;
	}
}