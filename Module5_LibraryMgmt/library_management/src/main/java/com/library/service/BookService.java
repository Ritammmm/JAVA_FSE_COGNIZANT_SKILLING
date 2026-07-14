package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayServiceMessage() {

        System.out.println("BookService is managing library operations.");

        bookRepository.displayRepositoryMessage();
    }
}