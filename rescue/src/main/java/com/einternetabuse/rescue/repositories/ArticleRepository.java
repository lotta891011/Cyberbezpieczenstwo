package com.einternetabuse.rescue.repositories;

import com.einternetabuse.rescue.model.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
