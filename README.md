# Rquirements to run this example 
1) Java 1.8
2) Maven (preferrably latest)
3) MongoDB Community edition. [ https://docs.mongodb.com/manual/administration/install-community/ ] 


## Graphiql is accessible at - http://localhost:8080/graphiql

### 1) Add new author

mutation {
  newAuthor(firstName: "Mahatma", lastName: "Gandhi") {
    firstName
    lastName
  }
}

### 2) Add new book

mutation {
  newBook(
    title: "Satyagraha in South Africa",
    isbn: "8172290412",
    author: 1) {
      bookId
      title
  }
}


### 3) View all books

{
  findAllBooks {
    bookId
    isbn
    title
    pageCount
    author {
      firstName
      lastName
    }
  }
}
