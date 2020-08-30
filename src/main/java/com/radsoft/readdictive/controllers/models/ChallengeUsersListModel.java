package com.radsoft.readdictive.controllers.models;

import java.util.List;

public class ChallengeUsersListModel {

    public List<ChallengeUsersModel> challengeUsersModels;

    public ChallengeUsersListModel(){}

    public ChallengeUsersListModel(List<ChallengeUsersModel> challengeUsersModels){
        this.challengeUsersModels = challengeUsersModels;
    }

    public List<ChallengeUsersModel> getChallengeUsersModels() {
        return challengeUsersModels;
    }
}
