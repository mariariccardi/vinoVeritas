package com.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Article;

@Repository
@Transactional
public interface ArticleRepository extends CrudRepository <Article,Long> {
}
