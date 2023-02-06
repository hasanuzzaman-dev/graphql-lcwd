package com.graphql.learn.controller;


import com.graphql.learn.entities.Book;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    //Create
    @PostMapping("/create-book")
    public Book create(@RequestBody Book book){
        return bookService.create(book);
    }

    @GetMapping("/get-books")
    public List<Book> getAllBook(){
        return bookService.getAllBook();
    }

    @GetMapping("/{bookId}")
    public Book getBookById(@PathVariable String bookId){
        return bookService.getBookById(bookId);
    }

}
