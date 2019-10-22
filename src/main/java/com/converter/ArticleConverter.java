package com.converter;

import org.springframework.stereotype.Component;

import com.dto.ArticleDTO;
import com.model.Article;

@Component
public class ArticleConverter extends AbstractConverter<Article,ArticleDTO> {
	public Article toEntity(ArticleDTO articleDTO) {
		Article article=null;
		if(articleDTO!=null) {
			article=new Article (articleDTO.getId(),articleDTO.getName(),articleDTO.getYear(),articleDTO.getCompany(),articleDTO.getPrice(),articleDTO.getUser());
			}
	return article;
	}
	
	public ArticleDTO toDto(Article article) {
		ArticleDTO articleDTO=null;
		if(article!=null) {
			articleDTO=new ArticleDTO (article.getId(),article.getName(),article.getYear(),article.getCompany(),article.getPrice(),article.getUser());
			}
	return articleDTO;
	}

}
