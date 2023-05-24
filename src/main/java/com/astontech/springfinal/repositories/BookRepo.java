package com.astontech.springfinal.repositories;

import com.astontech.springfinal.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Integer> {

}
