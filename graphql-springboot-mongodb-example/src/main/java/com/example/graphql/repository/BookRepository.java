package com.example.graphql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.graphql.model.Book;

public interface BookRepository extends MongoRepository<Book, Long> {
	Book findByBookId(Long bookId);
}
