package com.handzap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.handzap.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

	
	@Query("SELECT a FROM Author a")
	List<Author> getAuthors();

}
