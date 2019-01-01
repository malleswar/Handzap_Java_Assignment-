package com.handzap.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.handzap.vo.ArticleVo;

@Repository
public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

	@PersistenceContext
	EntityManager entityManager;

	public List<ArticleVo> mycustomQuery(String name) {

		@SuppressWarnings("unchecked")
		List<Object> articles = entityManager
				.createNativeQuery(
						"SELECT a.article_id,a.description,a.title FROM Article a "
								+ "LEFT JOIN Author b ON a.article_id = b.author_id  AND b.name = :authorName")
				.setParameter("authorName", name).getResultList();
		List<ArticleVo> list = new ArrayList<ArticleVo>();
		ArticleVo article = null;
		try {
			for (Iterator iterator = articles.iterator(); iterator.hasNext();) {
				Object[] obj = (Object[]) iterator.next();
				Long id = new Long(obj[0].toString());
				article = new ArticleVo(id, (String) obj[1],
						(String) obj[2]);
				list.add(article);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
