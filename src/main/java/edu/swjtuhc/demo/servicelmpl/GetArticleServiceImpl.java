package edu.swjtuhc.demo.servicelmpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.GetArticleMapper;
import edu.swjtuhc.demo.model.Article;
import edu.swjtuhc.demo.service.GetArticleService;

@Service
public class GetArticleServiceImpl implements GetArticleService{
	@Autowired
	GetArticleMapper searchMapper;

	@Override
	public List<Article> getArticleList() {
		// TODO Auto-generated method stub
		return searchMapper.getArticleList();
	}
	
	
}
