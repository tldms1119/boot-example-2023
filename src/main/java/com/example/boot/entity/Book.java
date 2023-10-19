package com.example.boot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookNo;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(nullable = false)
    private String author;

}
