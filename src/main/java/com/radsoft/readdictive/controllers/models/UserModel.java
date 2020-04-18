package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.User;

public class UserModel {

    Long Id;
    String nickname;
    String description;
    String role;
    String createdChallengesIds;
    String memberOfChallengesIds;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCreatedChallengesIds() {
        return createdChallengesIds;
    }

    public void setCreatedChallengesIds(String createdChallengesIds) {
        this.createdChallengesIds = createdChallengesIds;
    }

    public String getMemberOfChallengesIds() {
        return memberOfChallengesIds;
    }

    public void setMemberOfChallengesIds(String memberOfChallengesIds) {
        this.memberOfChallengesIds = memberOfChallengesIds;
    }

    public static UserModel toExternal(User user){
        UserModel userModel = new UserModel();
        userModel.setId(user.getId());
        userModel.setCreatedChallengesIds(user.getCreatedChallengesIds());
        userModel.setDescription(user.getDescription());
        userModel.setMemberOfChallengesIds(user.getMemberOfChallengesIds());
        userModel.setNickname(user.getNickname());
        userModel.setRole(user.getRole());
        return userModel;
    }

    public static User toInternal(UserModel userModel){
        return new User(
                userModel.nickname,
                userModel.description,
                userModel.role,
                userModel.createdChallengesIds,
                userModel.memberOfChallengesIds);
    }
}
