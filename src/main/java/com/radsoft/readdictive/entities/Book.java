package com.radsoft.readdictive.entities;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

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

    @Column(name ="isbn")
    private String isbn;

    public  Book(){ }

    public Book(String title, String author, int pageCount, String description, String imageURL, String goodReadsURL, String isbn){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.description = description;
        this.imageURL = imageURL;
        this.goodReadsURL =goodReadsURL;
        this.isbn = isbn;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPageCount (int pageCount){
        this.pageCount = pageCount;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getDescription() {
        return description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getGoodReadsURL() {
        return goodReadsURL;
    }

    public String getIsbn() {
        return isbn;
    }
}
