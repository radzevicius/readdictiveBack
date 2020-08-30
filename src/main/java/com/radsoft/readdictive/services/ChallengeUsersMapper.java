package com.radsoft.readdictive.services;

import com.radsoft.readdictive.controllers.models.ChallengeUsersModel;
import com.radsoft.readdictive.entities.ChallengeUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ChallengeUsersMapper {

    @Autowired
    ChallengeService challengeService;

    @Autowired
    UserService userService;

    public ChallengeUsersModel toChallengeUsersModel(ChallengeUsers challengeUsers){
        ChallengeUsersModel challengeUsersModel = new ChallengeUsersModel();
        challengeUsersModel.setId(challengeUsers.getId());
        challengeUsersModel.setUser(userService.getUserById(challengeUsers.getUserId()));
        challengeUsersModel.setChallenge(challengeService.getChallengeById(challengeUsers.getChallengeId()));
        challengeUsersModel.setCompletedDate(challengeUsers.getCompletedDate());
        return challengeUsersModel;
    }

    public List<ChallengeUsersModel> toChallengeUsersModelList(List<ChallengeUsers> challengeUsers){
        return challengeUsers.stream()
                .map(this::toChallengeUsersModel)
                .collect(Collectors.toList());
    }
}
