package com.library.libraryapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.libraryapp.entities.Fine;
import com.library.libraryapp.repositories.FineRepository;
import java.util.List;


@Service
public class FineService {
    @Autowired
    private FineRepository fineRepository;

    public List<Fine> getAllFines() {
        return fineRepository.findAll();
    }

    public Fine getFineByBorrowedId(Long borrowedId) {
        return fineRepository.findByBorrowedId(borrowedId);
    }
}