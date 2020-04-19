package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserListModel {

    private List<UserModel> users;

    public UserListModel(List<UserModel> users ){
        this.users = users;
    }

    public List<UserModel> getUserListModel(){
        return users;
    }

    public static UserListModel toExternal(List<User> users){
        return new UserListModel(
                users.stream()
                .map(UserModel::toExternal)
                .collect(Collectors.toList())
        );
    }
}
