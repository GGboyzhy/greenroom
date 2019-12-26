package edu.swjtuhc.demo.servicelmpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.ArticleUploadMapper;
import edu.swjtuhc.demo.model.Article;
import edu.swjtuhc.demo.service.ArticleUploadService;

@Service
public class ArticleUploadServiceImpl implements ArticleUploadService{
	
	@Autowired
	ArticleUploadMapper uploadMapper;
	
	@Override
		public int upload(Article article) {
			// TODO Auto-generated method stub
		
		//调用Mapper实现发布
		Article a0 = uploadMapper.selectArticleByTitle(article.getTitle());
		
		int i = -1;
		if (a0==null) {
			
			Date now = new Date();
			article.setCreate_time(now);
			i = uploadMapper.insertArticle(article);
		}else {
			i = 0; //文章不能重名
		}
			return i;
		}
}
