package com.handzap.repository;

import java.util.List;
import java.util.Map.Entry;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.handzap.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> { 
	

	@Query("SELECT a FROM Article a WHERE a.title = :title AND a.description = :description ")
	List<Article> getArticles(@Param("title") String title,@Param("description") String description);

	
	/*SELECT a.article_id,a.description,a.title
	FROM Article a
	LEFT JOIN Author b 
	ON a.article_id=b.author_id  AND b.NAME = 'malli'*/
	
	
	
	//SELECT c1, c2 FROM Country c1 INNER JOIN c1.neighbors c2
	
	/* private long id;
	   private String title;
	   private String description;
	   private Date publishedDate;
	   */
	   
	/*"SELECT p.firstName, p.lastName, n.phoneNumber FROM Person p
	 *  LEFT JOIN PhoneBookEntry n ON p.firstName = n.firstName
	 *   AND p.lastName = n.lastName*/	
	/*List<Object[]> results = em.createQuery("SELECT p.firstName, p.lastName, n.phoneNumber FROM Person p 
	 * LEFT JOIN PhoneBookEntry n ON p.firstName = n.firstName AND p.lastName = n.lastName").getResultList();
*/
	
	/*@Query("SELECT a.id,a.title,a.description,a.publishedDate from Article a LEFT JOIN Author b ON"
			+ "b.id = a.id AND b.name  = :name ")*/
	@Query( value= "SELECT a.article_id,a.description,a.title FROM Article a "
			+ "LEFT JOIN Author b ON a.article_id = b.author_id  AND b.NAME = :name" , nativeQuery = true)
	List<Article> getArticlesAuthorName(@Param("name") String name);
}
