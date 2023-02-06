package com.graphql.learn.services;

import com.graphql.learn.entities.Book;
import com.graphql.learn.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;


    @Override
    public Book create(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(String bookId) {
        return bookRepository.findById(bookId)
                .orElseThrow(()-> new RuntimeException("Book you are looking not found!!"));
    }
}
