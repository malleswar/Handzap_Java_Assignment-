package com.handzap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handzap.model.Article;
import com.handzap.repository.ArticleRepository;
import com.handzap.repository.CustomerRepositoryCustom;
import com.handzap.vo.ArticleVo;

@Service
public class ArticleService {

	@Autowired
	private ArticleRepository articleRepository;
	
	@Autowired
	private CustomerRepositoryCustom customerRepositoryCustom;
	
	
	public List<Article> getArticles(String title, String description) {
		return articleRepository.getArticles(title, description);
	}

	public List<ArticleVo> getArticlesAuthorName(String authorName) {
		return customerRepositoryCustom.mycustomQuery(authorName);
	}
}
