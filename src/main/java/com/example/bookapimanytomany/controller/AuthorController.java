package com.example.bookapimanytomany.controller;

import com.example.bookapimanytomany.entity.Author;
import com.example.bookapimanytomany.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> findAllAuthors() {
        return authorService.findAll();
    }

    @GetMapping("/{id}")
    public Author findAuthorById(@PathVariable("id") Long id) {
        return authorService.findById(id);
    }
}
