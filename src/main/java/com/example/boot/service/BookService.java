package com.example.boot.service;

import com.example.boot.entity.Book;
import com.example.boot.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class BookService {

    final BookRepository bookRepository;

    public void getBookInfo(){
        Book book = bookRepository.findById(1);
        log.info(book.getTitle());
    }

}
