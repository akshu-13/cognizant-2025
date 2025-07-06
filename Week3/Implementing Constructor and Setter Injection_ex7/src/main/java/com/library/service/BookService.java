package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Constructor Injection
    public BookService(BookRepository bookRepository) {
        System.out.println("Constructor Injection used");
        this.bookRepository = bookRepository;
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Setter Injection used");
        this.bookRepository = bookRepository;
    }

    // Method to display books
    public void displayBooks() {
        System.out.println("BookService: Preparing to fetch books...");
        bookRepository.fetchBooks();
    }
}
