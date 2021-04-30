package com.einternetabuse.rescue.controllers;

import com.einternetabuse.rescue.repositories.ArticleRepository;
import com.einternetabuse.rescue.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArticleController {

    private ArticleRepository articleRepository;

    public ArticleController(ArticleRepository articleRepository){
        this.articleRepository=articleRepository;
    }

    @RequestMapping("/articles")
    public String getArticles(Model model){
        model.addAttribute("articles", articleRepository.findAll());
        return "articles";
    }
}
