package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.Book;
import com.radsoft.readdictive.entities.Challenge;

public class ChallengeBooksModel {

    private Long id;

    private Challenge challenge;

    private Book book;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Challenge getChallenge() {
        return challenge;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }


}
