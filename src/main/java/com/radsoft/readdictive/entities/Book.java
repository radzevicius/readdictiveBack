package com.radsoft.readdictive.entities;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name= "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name ="page_count")
    private int  pageCount;

    @Column(name="description")
    private String description;

    @Column(name = "image_url")
    private String imageURL;

    @Column(name = "goodreads_url")
    private String goodReadsURL;

    public  Book(){

    }

    public Book(String title, String author, int pageCount, String description){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.description = description;
    }

}
