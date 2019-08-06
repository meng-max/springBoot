package com.example.demo.controller;

import com.example.demo.entity.test.Book;
import com.example.demo.repository.test.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookRepository bookRepository;
    @GetMapping("/")
    public List<Book> bookList(){
        return bookRepository.findAll();
    }
}