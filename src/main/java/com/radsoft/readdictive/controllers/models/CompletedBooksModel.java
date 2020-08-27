package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.Book;
import com.radsoft.readdictive.entities.CompletedBooks;
import com.radsoft.readdictive.entities.User;

public class CompletedBooksModel {

    private Long id;

    private User userId;

    private Book bookId;

    public  Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBookId() {
        return bookId;
    }

    public void setBookId(Book bookId) {
        this.bookId = bookId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public static CompletedBooks toInternal(CompletedBooksModel completedBooksModel){
        return new CompletedBooks.CompletedBooksBuilder()
                .withId(completedBooksModel.getId())
                .withBook(co)
                .withUser(completedBooksModel.getUserId())
                .build();
    }

    public static CompletedBooksModel toExternal(CompletedBooks completedBooks){
        CompletedBooksModel completedBooksModel = new CompletedBooksModel();
        completedBooksModel.setId(completedBooks.getId());
        completedBooksModel.setBookId();
        completedBooksModel.setUserId(completedBooks.);
        return completedBooksModel;
    }
}
