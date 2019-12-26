package edu.swjtuhc.demo.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import edu.swjtuhc.demo.model.Article;
import edu.swjtuhc.demo.service.ArticleUploadService;

@RestController
public class ArticleUploadController {
	
	@Autowired
	ArticleUploadService uploadService;
	
	@RequestMapping("/articleUpload")
    public JSONObject upload(@RequestBody Article article){
		
		JSONObject requestMap = new JSONObject(); 
		
		//调用Service
		int i = uploadService.upload(article);
		requestMap.put("state", i);
		
		return requestMap;	
	}
}
