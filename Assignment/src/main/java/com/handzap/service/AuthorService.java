package com.handzap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handzap.model.Article;
import com.handzap.model.Author;
import com.handzap.repository.ArticleRepository;
import com.handzap.repository.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;

	public List<Author> getAuthors() {
		return authorRepository.getAuthors();
	}
	
	
}
