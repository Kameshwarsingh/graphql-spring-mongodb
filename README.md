# Rquirements to run this example 
1) Java 8 or 9
2) Maven (Preferably  Maven 3.6.0  or latest)
3) MongoDB Community edition. [ https://docs.mongodb.com/manual/administration/install-community/ ] 



## Build using maven and test using graphiql UI

### GraphiQL-UI is  available at - http://localhost:8080/graphiql


### 1) Add new author (Insert data)

    mutation {
      newAuthor(firstName: "Mahatma", lastName: "Gandhi") {
        authorId
        firstName
        lastName
      }
    }


Note: Make note of authorId and use it for inserting book record


### 2) Add new book (Insert data)

    mutation {
      newBook(
        title: "Satyagraha in South Africa",
        isbn: "8172290412",
        author: 1) {
          bookId
          title
      }
    }

Note: In above example (Inserting book data) we have used "author: 1", instead use correct authorId received from first step (Inserting author data).


### 3) View all books (Query data)

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
