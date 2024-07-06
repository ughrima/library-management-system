package com.library.libraryapp.repositories;

import com.library.libraryapp.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    
}

