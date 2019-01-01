package com.handzap.repository;

import java.util.List;

import com.handzap.vo.ArticleVo;

public interface CustomerRepositoryCustom {
	List<ArticleVo> mycustomQuery(String name);
}