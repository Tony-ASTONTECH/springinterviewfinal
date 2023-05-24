package com.astontech.springfinal.services;

import com.astontech.springfinal.domain.Book;

public interface BookService {
    Iterable<Book> listAllBooks();

    Book getBookById(Integer id);

    Book saveBook(Book book);

    void deleteBook(Integer id);

}
