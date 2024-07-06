package com.library.libraryapp.repositories;


import com.library.libraryapp.entities.Borrowed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowedRepository extends JpaRepository<Borrowed, Long> {
    
}