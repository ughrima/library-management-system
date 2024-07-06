package com.library.libraryapp.entities;

import java.math.BigDecimal;


import jakarta.persistence.*;


public class Fine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long borrowedId;
    private BigDecimal amount;
    private int overdueDays;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getBorrowedId() { return borrowedId; }
    public void setBorrowedId(Long borrowedId) { this.borrowedId = borrowedId; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public int getOverdueDays() { return overdueDays; }
    public void setOverdueDays(int overdueDays) { this.overdueDays = overdueDays; }
}