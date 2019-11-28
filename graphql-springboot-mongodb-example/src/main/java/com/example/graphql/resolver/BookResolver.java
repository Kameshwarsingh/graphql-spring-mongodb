package com.example.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.model.Author;
import com.example.graphql.model.Book;
import com.example.graphql.repository.AuthorRepository;

public class BookResolver implements GraphQLResolver<Book> {

	@Autowired
	private AuthorRepository authorRepository;

	public Author getAuthor(Book book) {
		return authorRepository.findByAuthorId(book.getAuthor().getAuthorId());
	}
}
