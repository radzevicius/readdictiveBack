package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.ChallengeBooks;

public class ChallengeBooksIdModel {

    private Long id;

    private Long challengeId;

    private Long bookId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChallengeId() {
        return challengeId;
    }

    public void setChallengeId(Long challengeId) {
        this.challengeId = challengeId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public static ChallengeBooks toInternal(ChallengeBooksIdModel challengeBooksIdModel){
        return new ChallengeBooks.ChallengeBooksBuilder()
                .withId(challengeBooksIdModel.getId())
                .withBookId(challengeBooksIdModel.getBookId())
                .withChallengeId(challengeBooksIdModel.getChallengeId())
                .build();

    }
}
