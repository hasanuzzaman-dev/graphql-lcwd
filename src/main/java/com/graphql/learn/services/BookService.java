package com.graphql.learn.services;

import com.graphql.learn.entities.Book;

import java.util.List;


public interface BookService {

    //create
    Book create(Book book);

    //Gel All Book
    List<Book> getAllBook();

    //Get book By id
    Book getBookById(String bookId);

}
