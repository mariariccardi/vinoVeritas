package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.ArticleDTO;
import com.service.ArticleService;

@RestController
@RequestMapping("/article")
@CrossOrigin(origins="http://localhost4200")
public class ArticleController extends AbstractController<ArticleDTO> {
	@Autowired
	private ArticleService articleService;
}
