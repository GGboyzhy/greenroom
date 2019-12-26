package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import edu.swjtuhc.demo.model.Article;

@Mapper
public interface GetArticleMapper{
	public List<Article> getArticleList();
}
