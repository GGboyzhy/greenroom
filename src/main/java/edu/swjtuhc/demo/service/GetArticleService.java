package edu.swjtuhc.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import edu.swjtuhc.demo.model.Article;

public interface GetArticleService {
	public List<Article> getArticleList();
	
}
