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
    private Long  pageCount;

    @Column(name="description")
    private String description;

    @Column(name = "image_url")
    private String imageURL;

    @Column(name = "goodreads_url")
    private String goodreadsUrl;

    @Column(name ="isbn")
    private Long isbn;

    @Column(name="genre")
    private String genre;

    public  Book(){ }

    public Book(String title, String author, Long pageCount, String description, String imageURL, String goodreadsURL, Long isbn, String genre){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.description = description;
        this.imageURL = imageURL;
        this.goodreadsUrl =goodreadsURL;
        this.isbn = isbn;
        this.genre = genre;
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

    public Long getPageCount() {
        return pageCount;
    }

    public String getDescription() {
        return description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getGoodReadsUrl() {
        return goodreadsUrl;
    }

    public Long getIsbn() {
        return isbn;
    }

    public String getGenre() {
        return genre;
    }
}
