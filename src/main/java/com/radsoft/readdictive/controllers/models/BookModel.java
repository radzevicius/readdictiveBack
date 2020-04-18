package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.Book;

public class BookModel {
    private long id;

    private String title;

    private String author;

    private int  pageCount;

    private String description;

    private String imageURL;

    private String goodReadsURL;

    private String isbn;

    public BookModel(String title, String author, int pageCount, String description){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.description = description;
    }

    public BookModel(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
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

    public String getGoodReadsURL() {
        return goodReadsURL;
    }

    public void setGoodReadsURL(String goodReadsURL) {
        this.goodReadsURL = goodReadsURL;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public static Book toInternal(BookModel bookModel){
        return (new Book(
                bookModel.getTitle(),
                bookModel.getAuthor(),
                bookModel.getPageCount(),
                bookModel.getDescription(),
                bookModel.getImageURL(),
                bookModel.getGoodReadsURL(),
                bookModel.getIsbn()));
    }

    public static BookModel toExternal(Book book){
        BookModel bookModel = new BookModel();
        bookModel.setAuthor(book.getAuthor());
        bookModel.setDescription(book.getDescription());
        bookModel.setPageCount(book.getPageCount());
        bookModel.setTitle(book.getTitle());
        bookModel.setGoodReadsURL(book.getGoodReadsURL());
        bookModel.setImageURL(book.getImageURL());
        bookModel.setIsbn(book.getIsbn());
        bookModel.setId(book.getId());
        return bookModel;
    }
}
