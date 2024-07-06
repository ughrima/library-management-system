package com.library.libraryapp.controllers;


import com.library.libraryapp.entities.Fine;
import com.library.libraryapp.services.FineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fines")
public class FineController {

    @Autowired
    private FineService fineService;

    @GetMapping
    public List<Fine> getAllFines() {
        return fineService.getAllFines();
    }

    @GetMapping("/borrowed/{borrowedId}")
    public Fine getFineByBorrowedId(@PathVariable Long borrowedId) {
        return fineService.getFineByBorrowedId(borrowedId);
    }
}


