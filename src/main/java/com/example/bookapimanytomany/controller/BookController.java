package com.example.bookapimanytomany.controller;

import com.example.bookapimanytomany.entity.Book;
import com.example.bookapimanytomany.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> findAllBooks() {
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public Book findBookById(@PathVariable("id") Long id) {
        return bookService.findById(id);
    }
}
