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
import com.handzap.model.Author;
import com.handzap.responsemodel.APIResponse;
import com.handzap.service.ArticleService;
import com.handzap.service.AuthorService;
import com.handzap.util.ResponseUtil;

@RestController
public class AuthorsController {

	@Autowired
	AuthorService authorService;

	@Autowired
	protected ResponseUtil responseUtil;

	// "//authors"
	@RequestMapping(value = APIName.AUTHOR_LIST, method = RequestMethod.GET, produces = APIName.CHARSET)
	public ResponseEntity<APIResponse> getAuthors() {
		List<Author> articles = authorService.getAuthors();
		return responseUtil.successResponse(articles);
	}
}
