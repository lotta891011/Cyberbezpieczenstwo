package com.einternetabuse.rescue.converters;


import com.einternetabuse.rescue.commands.ArticleCommand;
import com.einternetabuse.rescue.model.Article;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ArticleCommandToArticleConverter implements Converter<ArticleCommand, Article >{
    @Override
    @Nullable
    @Synchronized
    public Article convert(ArticleCommand source){
        if (source == null){
            return null;
        }
        final Article article = new Article();
        article.setAuthors(source.getAuthors());
        article.setContent(source.getContent());
        article.setTitle(source.getTitle());
        return article;
    }
}
