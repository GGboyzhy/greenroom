package edu.swjtuhc.demo.mapper;

import java.util.Date;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import edu.swjtuhc.demo.model.Article;

@Mapper
public interface ArticleUploadMapper{
	
    int insertArticle(Article article);
    public Article selectArticleByTitle(String title);
	
}
