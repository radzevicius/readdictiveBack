package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.Challenge;

import java.util.Date;

public class ChallengeModel {

    Long Id;
    String name;
    String description;
    String bookIds;
    String userIds;
    Long creatorId;
    Date deadlineDate;
    Date startedDate;

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

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) { this.creatorId = creatorId; }

    public Date getDeadlineDate() { return deadlineDate; }

    public void setDeadlineDate(Date deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(Date startedDate) {
        this.startedDate = startedDate;
    }

    public static ChallengeModel toExternal(Challenge challenge){
        ChallengeModel challengeModel = new ChallengeModel();
        challengeModel.setBookIds(challenge.getBookIds());
        challengeModel.setCreatorId(challenge.getCreatorId());
        challengeModel.setDescription(challenge.getDescription());
        challengeModel.setId(challenge.getId());
        challengeModel.setName(challenge.getName());
        challengeModel.setUserIds(challenge.getUserIds());
        challengeModel.setDeadlineDate(challenge.getDeadlineDate());
        challengeModel.setStartedDate(challenge.getStartedDate());
        return challengeModel;
    }

    public static Challenge toInternal(ChallengeModel challengeModel){
        return new Challenge.ChallengeBuilder()
                .id(challengeModel.getId())
                .name(challengeModel.getName())
                .description(challengeModel.getDescription())
                .bookIds(challengeModel.getBookIds())
                .userIds(challengeModel.getUserIds())
                .creatorId(challengeModel.getCreatorId())
                .deadlineDate(challengeModel.getDeadlineDate())
                .startedDate(challengeModel.getStartedDate())
                .build();
    }


}
