package com.example.graphql.model;

import java.util.Random;

import org.springframework.data.annotation.Id;


public class Author {
    @Id
    private Long authorId;

    private String firstName;

    private String lastName;

    public Author() {
    	//TODO author id should be generated from MongoDB Sequence 
    	this.authorId= new Random().nextLong();
    }

    public Author(Long authorId) {
        this.authorId = authorId;
    }

    public Author(String firstName, String lastName) {
    	//TODO author id should be generated from MongoDB Sequence 
    	this.authorId= new Random().nextLong();
        this.firstName = firstName;
        this.lastName = lastName;
    }

   
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        return authorId.equals(author.authorId);
    }

    public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	@Override
    public int hashCode() {
        return authorId.hashCode();
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + authorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
