package com.graphql.learn.controller;


import com.graphql.learn.entities.Book;
import com.graphql.learn.entities.BookInput;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    //Create

    @MutationMapping("createBook")
    public Book create(@Argument BookInput book) {
        Book b = new Book();

        b.setTitle(book.getTitle());
        b.setDesc(book.getDesc());
        b.setAuthor(book.getAuthor());
        b.setPrice(book.getPrice());
        b.setPages(book.getPages());

        return bookService.create(b);
    }

    @QueryMapping("allBooks")
    public List<Book> getAllBook() {
        return bookService.getAllBook();
    }

    @QueryMapping("getBookById")
    public Book getBookById(@Argument String bookId) {
        return bookService.getBookById(bookId);
    }

}

