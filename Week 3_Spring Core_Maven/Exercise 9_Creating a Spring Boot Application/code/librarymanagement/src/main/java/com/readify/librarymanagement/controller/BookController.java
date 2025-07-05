package com.readify.librarymanagement.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.readify.librarymanagement.model.Book;
import com.readify.librarymanagement.repository.BookRepository;

import java.util.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> getAllBooks() 
    {
        return bookRepository.findAll();
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) 
    {
        return bookRepository.save(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book bookDetails) 
    {
        Book book = bookRepository.findById(id).orElseThrow();
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        book.setQuantity(bookDetails.getQuantity());
        return bookRepository.save(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) 
    {
        bookRepository.deleteById(id);
    }
}

