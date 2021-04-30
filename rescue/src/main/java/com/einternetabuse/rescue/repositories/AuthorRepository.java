package com.einternetabuse.rescue.repositories;

import com.einternetabuse.rescue.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
