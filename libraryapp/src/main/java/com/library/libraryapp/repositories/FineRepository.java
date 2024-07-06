package com.library.libraryapp.repositories;

import com.library.libraryapp.entities.Fine;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FineRepository extends JpaRepository<Fine, Long> {
    Fine findByBorrowedId(Long borrowedId);
}