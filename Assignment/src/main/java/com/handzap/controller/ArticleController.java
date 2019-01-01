package com.handzap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.handzap.config.APIName;
import com.handzap.model.Article;
import com.handzap.responsemodel.APIResponse;
import com.handzap.service.ArticleService;
import com.handzap.util.ResponseUtil;
import com.handzap.vo.ArticleVo;

@RestController
public class ArticleController {

	@Autowired
	ArticleService articleService;

	@Autowired
	protected ResponseUtil responseUtil;

	// "/articles/{title}/{description}"
	@RequestMapping(value = APIName.ARTICLES_TITLE_DESCRIPTION_LIST, method = RequestMethod.GET, produces = APIName.CHARSET)
	public ResponseEntity<APIResponse> getArticlesTitledes(
			@PathVariable(value = "title") String title,
			@PathVariable(value = "description") String description) {

		System.out.println("title :: " + title + "description :: "
				+ description);
		List<Article> articles = articleService.getArticles(title, description);

		return responseUtil.successResponse(articles);

	}

	// "/articles/{authorName}"
	@RequestMapping(value = APIName.ARTICLES_AUTHOR_NAME_LIST, method = RequestMethod.GET, produces = APIName.CHARSET)
	public ResponseEntity<APIResponse> getArticlesAuthorName(@PathVariable(value = "authorName") String authorName) {

		System.out.println("authorName :: " + authorName);
		List<ArticleVo> articles = articleService.getArticlesAuthorName(authorName);

		return responseUtil.successResponse(articles);

	}
}
