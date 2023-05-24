package com.astontech.springfinal.services.impl;

import com.astontech.springfinal.domain.Book;
import com.astontech.springfinal.repositories.BookRepo;
import com.astontech.springfinal.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepo bookRepo;

    @Override
    public Iterable<Book> listAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public Book getBookById(Integer id) {
        return bookRepo.findOne(id);
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public void deleteBook(Integer id) {
        bookRepo.delete(id);
    }
}
