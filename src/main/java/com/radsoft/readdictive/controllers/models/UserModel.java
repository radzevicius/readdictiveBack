package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.User;

import java.util.Date;

public class UserModel {

    private Long Id;
    private String nickname;
    private String description;
    private String role;
    private String avatarImageUrl;
    private Date joinedDate;
    private String completedBooksIds;

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

    public void setRole(String role) { this.role = role; }

    public String getAvatarImageUrl() {
        return avatarImageUrl;
    }

    public void setAvatarImageUrl(String avatarImageUrl) {
        this.avatarImageUrl = avatarImageUrl;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getCompletedBooksIds() { return completedBooksIds; }

    public void setCompletedBooksIds(String completedBooksIds) { this.completedBooksIds = completedBooksIds; }

    public static UserModel toExternal(User user){
        UserModel userModel = new UserModel();
        userModel.setId(user.getId());
        userModel.setDescription(user.getDescription());
        userModel.setNickname(user.getNickname());
        userModel.setRole(user.getRole());
        userModel.setAvatarImageUrl(user.getAvatarImageUrl());
        userModel.setJoinedDate(user.getJoinedDate());
        userModel.setCompletedBooksIds(user.getCompletedBooksIds());
        return userModel;
    }

    public static User toInternal(UserModel userModel){
        return new User(
                userModel.getNickname(),
                userModel.getDescription(),
                userModel.getRole(),
                userModel.getAvatarImageUrl(),
                userModel.getJoinedDate(),
                userModel.getCompletedBooksIds());
    }


}
