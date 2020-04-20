package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.Challenge;

import java.util.List;
import java.util.stream.Collectors;

public class ChallengeListModel {

    private List<ChallengeModel> challenges;

    public ChallengeListModel(List<ChallengeModel> challenges){
        this.challenges = challenges;
    }

    public List<ChallengeModel> getChallengeListModel(){
        return challenges;
    }

    public static ChallengeListModel toExternal(List<Challenge> challenges){
        return new ChallengeListModel(challenges.stream()
            .map(ChallengeModel::toExternal)
            .collect(Collectors.toList()));
    }
}
