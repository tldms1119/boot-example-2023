package com.example.boot.controller;

import com.example.boot.common.config.AppConfig;
import com.example.boot.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequiredArgsConstructor
public class SampleController {

    final AppConfig appConfig;
    final BookService bookService;

    @GetMapping("/sample")
    public String getSample(){
        log.info("SampleController Log");
        bookService.getBookInfo();
        return String.format("SampleController Return %s", appConfig.getDescription());
    }

}
