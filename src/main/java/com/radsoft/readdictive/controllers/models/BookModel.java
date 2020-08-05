package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.Book;

public class BookModel {
    private Long id;

    private String title;

    private String author;

    private Long pageCount;

    private String description;

    private String imageURL;

    private String goodreadsUrl;

    private Long isbn;

    private String genre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getPageCount() {
        return pageCount;
    }

    public void setPageCount(Long pageCount) {
        this.pageCount = pageCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getGoodreadsUrl() {
        return goodreadsUrl;
    }

    public void setGoodreadsUrl(String goodreadsUrl) {
        this.goodreadsUrl = goodreadsUrl;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public static Book toInternal(BookModel bookModel){
        return new Book.BookBuilder()
                .withId(bookModel.getId())
                .withTitle(bookModel.getTitle())
                .withAuthor(bookModel.getAuthor())
                .withPageCount(bookModel.getPageCount())
                .withDescription(bookModel.getDescription())
                .withImageUrl(bookModel.getImageURL())
                .withGoodreadsUrl(bookModel.getGoodreadsUrl())
                .withIsbn(bookModel.getIsbn())
                .withGenre(bookModel.getGenre())
                .build();
    }

    public static BookModel toExternal(Book book){
        BookModel bookModel = new BookModel();
        bookModel.setAuthor(book.getAuthor());
        bookModel.setDescription(book.getDescription());
        bookModel.setPageCount(book.getPageCount());
        bookModel.setTitle(book.getTitle());
        bookModel.setGoodreadsUrl(book.getGoodReadsUrl());
        bookModel.setImageURL(book.getImageURL());
        bookModel.setIsbn(book.getIsbn());
        bookModel.setId(book.getId());
        bookModel.setGenre(book.getGenre());
        return bookModel;
    }


}
