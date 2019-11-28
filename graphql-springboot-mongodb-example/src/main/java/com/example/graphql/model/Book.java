package com.example.graphql.model;

import java.util.Random;

import org.springframework.data.annotation.Id;


public class Book {
    @Id
    private Long bookId;


    private String title;


    private String isbn;


    private int pageCount;


    private Author author;

    public Book() {
    	//TODO book id should be generated from MongoDB Sequence 
    	this.bookId= new Random().nextLong();
    }

    public Book(String title, String isbn, int pageCount, Author author) {
    	//TODO book id should be generated from MongoDB Sequence 
    	this.bookId= new Random().nextLong();
    	
    	this.title = title;
        this.isbn = isbn;
        this.pageCount = pageCount;
        this.author = author;
    }

    
    public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return bookId.equals(book.bookId);
    }

    @Override
    public int hashCode() {
        return bookId.hashCode();
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + bookId +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", pageCount=" + pageCount +
                ", author=" + author +
                '}';
    }
}
