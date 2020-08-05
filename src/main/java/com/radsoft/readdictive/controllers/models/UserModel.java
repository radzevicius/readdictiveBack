package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.CompletedBooks;
import com.radsoft.readdictive.entities.User;

import java.util.Date;
import java.util.Set;

public class UserModel {

    private Long Id;
    private String nickname;
    private String description;
    private String role;
    private String avatarImageUrl;
    private Date joinedDate;

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


    public static UserModel toExternal(User user){
        UserModel userModel = new UserModel();
        userModel.setId(user.getId());
        userModel.setDescription(user.getDescription());
        userModel.setNickname(user.getNickname());
        userModel.setRole(user.getRole());
        userModel.setAvatarImageUrl(user.getAvatarImageUrl());
        userModel.setJoinedDate(user.getJoinedDate());
        return userModel;
    }

    public static User toInternal(UserModel userModel){
        return new User.UserBuilder()
                .withId(userModel.getId())
                .withRole(userModel.getRole())
                .withNickname(userModel.getNickname())
                .withJoinedDate(userModel.getJoinedDate())
                .withDescription(userModel.getDescription())
                .withAvatarImageUrl(userModel.getAvatarImageUrl())
                .withJoinedDate(userModel.getJoinedDate())
                .build();
    }


}
