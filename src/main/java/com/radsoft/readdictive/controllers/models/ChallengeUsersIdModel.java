package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.ChallengeUsers;

import java.util.Date;

public class ChallengeUsersIdModel {

    Long id;

    Long challengeId;

    Long userId;

    Date completedDate;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }

    public static ChallengeUsers toInternal(ChallengeUsersIdModel challengeUsersIdModel){
        return new ChallengeUsers.ChallengeUsersBuilder()
                .withId(challengeUsersIdModel.getId())
                .withChallengeId(challengeUsersIdModel.getChallengeId())
                .withUserId(challengeUsersIdModel.getUserId())
                .withCompletedDate(challengeUsersIdModel.getCompletedDate())
                .build();
    }
}
