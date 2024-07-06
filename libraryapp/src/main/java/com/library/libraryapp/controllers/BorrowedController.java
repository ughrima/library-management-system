package com.library.libraryapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.library.libraryapp.entities.Borrowed;
import com.library.libraryapp.services.BorrowedService;

import java.util.List;

@RestController
@RequestMapping("/borrowed")
public class BorrowedController {
    @Autowired
    private BorrowedService borrowedService;

    @GetMapping
    public List<Borrowed> getAllBorrowed() {
        return borrowedService.getAllBorrowed();
    }

    @PostMapping("/borrow")
    public Borrowed borrowBook(@RequestParam Long studentId, @RequestParam Long bookId) {
        return borrowedService.borrowBook(studentId, bookId);
    }

    @PostMapping("/return/{id}")
    public void returnBook(@PathVariable Long id) {
        borrowedService.returnBook(id);
    }
}
