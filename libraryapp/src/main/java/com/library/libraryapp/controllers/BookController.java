package com.library.libraryapp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.library.libraryapp.entities.Book;
import com.library.libraryapp.services.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
}

@GetMapping
public List<Book> getAllBooks(){
    return bookService.getAllBooks();
}

@GetMapping("/{id}")
public Book getBookById(@PathVariable Long id) {
    return bookService.getBookById(id);
}

@PostMapping
public Book addBook(@RequestBody Book book) {
    return bookService.addBook(book);
}

@PutMapping("/{id}")
public Book updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
    return bookService.updateBook(id, bookDetails);
}

@DeleteMapping("/{id}")
public void deleteBook(@PathVariable Long id) {
    bookService.deleteBook(id);
}

