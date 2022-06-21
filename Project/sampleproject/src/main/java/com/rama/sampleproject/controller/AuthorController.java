package com.rama.sampleproject.controller;

import  com.rama.sampleproject.entity.Author;
import  com.rama.sampleproject.entity.Student;
import  com.rama.sampleproject.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @PostMapping("/addauthor")
    public Author addAuthor(@RequestBody Author author){
        return authorService.saveAuthor(author);
    }

    @PostMapping("/addauthors")
    public List<Author> addAuthors(@RequestBody List<Author> authors){
        return  authorService.saveAuthors(authors);
    }
    @GetMapping("/authors")
    public List<Author> getAuthors(){
        return authorService.getAuthors();
    }

    @GetMapping("/findauthorbyid/{id}")
    public Author findAuthorById(@PathVariable int id){
        return authorService.getAuthorById(id);
    }

    @DeleteMapping("/deleteauthorbyid/{id}")
    public String deleteAuthorById(@PathVariable int id){
        return authorService.deleteAuthorById(id);
    }

    @PutMapping("/update")
    public Author author(@RequestBody Author author){
        return authorService.updateAuthor(author);
    }
}

