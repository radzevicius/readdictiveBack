package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.Challenge;

public class ChallengeModel {

    Long Id;
    String name;
    String description;
    String bookIds;
    String userIds;
    String creatorId;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBookIds() {
        return bookIds;
    }

    public void setBookIds(String bookIds) {
        this.bookIds = bookIds;
    }

    public String getUserIds() {
        return userIds;
    }

    public void setUserIds(String userIds) {
        this.userIds = userIds;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public static ChallengeModel toExternal(Challenge challenge){
        ChallengeModel challengeModel = new ChallengeModel();
        challengeModel.setBookIds(challenge.getBookIds());
        challengeModel.setCreatorId(challenge.getCreatorId());
        challengeModel.setDescription(challenge.getDescription());
        challengeModel.setId(challenge.getId());
        challengeModel.setName(challenge.getName());
        challengeModel.setUserIds(challenge.getUserIds());
        return challengeModel;
    }

    public static Challenge toInternal(ChallengeModel challengeModel){
        return new Challenge(
                challengeModel.name,
                challengeModel.description,
                challengeModel.bookIds,
                challengeModel.userIds,
                challengeModel.creatorId);
    }
}
