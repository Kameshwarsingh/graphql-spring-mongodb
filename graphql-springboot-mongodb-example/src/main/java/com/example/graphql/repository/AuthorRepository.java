package com.example.graphql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.graphql.model.Author;

public interface AuthorRepository extends MongoRepository<Author, Long> {
	Author findByAuthorId(Long authorId);
}
