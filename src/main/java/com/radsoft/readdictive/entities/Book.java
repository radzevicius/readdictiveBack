package com.radsoft.readdictive.entities;

import javax.persistence.*;
import java.util.Set;


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


    public static class BookBuilder{
        Long id;
        String title;
        String author;
        Long pageCount;
        String description;
        String imageUrl;
        String goodreadsUrl;
        Long isbn;
        String genre;

        public BookBuilder withId(Long id){
            this.id = id;
            return this;
        }

        public BookBuilder withTitle(String title){
            this.title = title;
            return this;
        }

        public BookBuilder withAuthor(String author){
            this.author = author;
            return this;
        }

        public BookBuilder withPageCount(Long pageCount){
            this.pageCount = pageCount;
            return this;
        }

        public BookBuilder withDescription(String description){
            this.description = description;
            return this;
        }

        public BookBuilder withImageUrl (String imageUrl){
            this.imageUrl = imageUrl;
            return this;
        }

        public BookBuilder withGoodreadsUrl(String goodreadsUrl){
            this.goodreadsUrl = goodreadsUrl;
            return this;
        }

        public BookBuilder withIsbn(Long isbn){
            this.isbn = isbn;
            return this;
        }

        public BookBuilder withGenre(String genre){
            this.genre =genre;
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }

    public Book(){ }

    public Book(BookBuilder bookBuilder){
        this.id = bookBuilder.id;
        this.genre= bookBuilder.genre;
        this.isbn = bookBuilder.isbn;
        this.imageURL = bookBuilder.imageUrl;
        this.description = bookBuilder.description;
        this.pageCount = bookBuilder.pageCount;
        this.author = bookBuilder.author;
        this.title = bookBuilder.title;
        this.goodreadsUrl = bookBuilder.goodreadsUrl;
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
