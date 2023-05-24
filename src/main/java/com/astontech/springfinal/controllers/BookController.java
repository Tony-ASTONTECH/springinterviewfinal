package com.astontech.springfinal.controllers;

import com.astontech.springfinal.domain.Book;
import com.astontech.springfinal.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String bookList(Model model){

        model.addAttribute("book", bookService.listAllBooks());

        return "/view-books";
    }

    @RequestMapping(value = "/book/addBook", method = RequestMethod.GET)
    public String getAddBook(Model model){

        model.addAttribute("book", new Book());

        return "/book/add-book";

    }

}
