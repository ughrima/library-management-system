package com.library.libraryapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //means its mapped to a table in the databse
public class Book {
    @Id //marks field as primary key
    //this means primary key should be generated automatically by the db using an identity colum
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    
    private Long id;
    private String title;
    private  String author;
    private boolean isBorrowed;

    //Getters and Setters
    public Long getId(){ return id;}
    public void setId(Long id) {this.id=id;}

    public String getTitle(){ return title;}
    public void setTitle(String title) {this.title=title;}

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public boolean isBorrowed() { return isBorrowed; }
    public void setBorrowed(boolean borrowed) { isBorrowed = borrowed; }
}