package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.CompletedBooks;

public class CompletedBooksIdModel {

    private Long id;

    private Long bookId;

    private Long userId;

    public Long getId() { return id; }

    public Long getBookId(){
        return bookId;
    }

    public Long getUserId(){
        return userId;
    }

    public static CompletedBooks toInternal(CompletedBooksIdModel completedBooksIdModel){
        return new CompletedBooks.CompletedBooksBuilder()
                .withId(completedBooksIdModel.getId())
                .withBookId(completedBooksIdModel.getBookId())
                .withUserId(completedBooksIdModel.getUserId())
                .build();
    }


}
