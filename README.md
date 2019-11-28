## GraphQL using Java and Springboot
Idea of this sample program is to illustrated GraphQL using Java, Springboot, and MongoDB as data-store. This sample java/maven code is to illustrate GraphQL mutation and query, code must be used only as an example. This example also illustrates GraphiQL for quick testing and experimenting with dynamic query and mutation.

## Dependencies 
        1) Java 8 or 9
        2) Maven (Preferably  Maven 3.6.0  or latest)
        3) MongoDB Community edition. [ You are required to install mongodb on your laptop/mac. This example uses mongodb as data store. Community edition is available at https://docs.mongodb.com/manual/administration/install-community/ ] 
        4) GraphQL, SpringBoot [ These dependencies will be pulled by maven at build time ]


## Build and Test
### GraphiQL-UI is  available at
        http://localhost:8080/graphiql

### 1) Add new author (Insert data)

    mutation {
      newAuthor(firstName: "Mahatma  M. K. ", lastName: "Gandhi") {
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
