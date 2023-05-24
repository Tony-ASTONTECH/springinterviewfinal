package com.astontech.springfinal.domain;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BookId")
    private Integer id;

    @Version
    private Integer version;

    private String isbn;

    private String Name;

    private String Author;

    public Book(){};

    public Book(String name){
        this.setName(name);
    }

    public Book(String name, String author) {
        this.setName(name);
        this.setAuthor(author);
    }

    public Book(String isbn, String name, String author) {
        this.setISBN(isbn);
        this.setName(name);
        this.setAuthor(author);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
