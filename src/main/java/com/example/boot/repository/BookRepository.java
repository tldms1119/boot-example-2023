package com.example.boot.repository;

import com.example.boot.entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    Book findById(long id);
    List<Book> findByTitle(String title);

}
