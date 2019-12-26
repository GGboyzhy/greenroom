package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import edu.swjtuhc.demo.model.Article;
import edu.swjtuhc.demo.service.GetArticleService;

@RestController
public class GetArticleController {

	@Autowired
	GetArticleService searchService;
	
	
	@RequestMapping("/getArticle")
    public List<Article> getArticle(){
        return searchService.getArticleList();
    }

}
