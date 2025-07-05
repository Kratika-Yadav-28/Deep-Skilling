package com.library.service;

import com.library.repository.BookRepository;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    // Setter for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        List<String> books = bookRepository.fetchBookList();
        System.out.println("Books Available:");
        books.forEach(System.out::println);
    }
}
