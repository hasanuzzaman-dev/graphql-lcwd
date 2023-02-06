package com.graphql.learn.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "books")
@Getter
@Setter
@ToString
public class Book {

    @Id
    private String bookId = UUID.randomUUID().toString();
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;
}
