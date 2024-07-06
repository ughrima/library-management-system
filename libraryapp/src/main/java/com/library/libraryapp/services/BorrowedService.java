package com.library.libraryapp.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.library.libraryapp.entities.Book;
import com.library.libraryapp.entities.Borrowed;
import com.library.libraryapp.repositories.BookRepository;
import com.library.libraryapp.repositories.BorrowedRepository;
import com.library.libraryapp.repositories.StudentRepository;

import java.time.LocalDate;
import java.util.List;

public class BorrowedService {
    @Autowired
    private BorrowedRepository borrowedRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private StudentRepository studentRepository;

    public List<Borrowed> getAllBorrowed(){
        return borrowedRepository.findAll();
    }

    public Borrowed borrowBook(Long studentId, Long bookId ){
        Book book=bookRepository.findById(bookId).orElse(null);
        if(book != null && !book.isBorrowed()){
            book.setBorrowed(true);
            bookRepository.save(book);
            Borrowed borrowed = new Borrowed();
            borrowed.setStudent(studentRepository.findById(studentId).orElse(null));
            borrowed.setBook(book);
            borrowed.setBorrowDate(LocalDate.now());
            return borrowedRepository.save(borrowed);
        }
        return null;
    }
    public void returnBook(Long borrowedId){
        Borrowed borrowed=borrowedRepository.findById(borrowedId).orElse(null);
        if (borrowed != null) {
            Book book = borrowed.getBook();
            book.setBorrowed(false);
            bookRepository.save(book);
            borrowed.setReturnDate(LocalDate.now());
            borrowedRepository.save(borrowed);
        }
    }
}
