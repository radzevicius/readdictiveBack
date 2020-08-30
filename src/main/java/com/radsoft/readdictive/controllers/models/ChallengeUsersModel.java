package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.Challenge;
import com.radsoft.readdictive.entities.User;

import java.util.Date;

public class ChallengeUsersModel {

    Long Id;

    Challenge challenge;

    User user;

    Date completedDate;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Challenge getChallenge() {
        return challenge;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }
}
