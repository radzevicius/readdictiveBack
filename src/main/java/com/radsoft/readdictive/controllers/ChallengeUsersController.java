package com.radsoft.readdictive.controllers;


import com.radsoft.readdictive.controllers.models.ChallengeUsersIdModel;
import com.radsoft.readdictive.controllers.models.ChallengeUsersListModel;
import com.radsoft.readdictive.controllers.models.ChallengeUsersModel;
import com.radsoft.readdictive.entities.ChallengeUsers;
import com.radsoft.readdictive.services.ChallengeUsersMapper;
import com.radsoft.readdictive.services.ChallengeUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/challenge/users")
@CrossOrigin("http://192.168.1.248:3000")
public class ChallengeUsersController {

    @Autowired
    private ChallengeUsersMapper challengeUsersMapper;

    @Autowired
    private ChallengeUsersService challengeUsersService;

    @PostMapping("/create")
    public void createChallengeUsers(@RequestBody ChallengeUsersIdModel challengeUsersIdModel){
        ChallengeUsers challengeUsers = ChallengeUsersIdModel.toInternal(challengeUsersIdModel);
        challengeUsersService.storeChallengeUsers(challengeUsers);
    }

    @GetMapping("/all")
    public ChallengeUsersListModel searchAllChallengeUsers(){
        List<ChallengeUsers> challengeUsers = challengeUsersService.getAllChallengeUsers();
        return new ChallengeUsersListModel(challengeUsersMapper.toChallengeUsersModelList(challengeUsers));
    }

    @GetMapping("/challenge/{id}")
    public ChallengeUsersListModel findChallengeUsersByChallengeId(@PathVariable("id") Long id){
        List<ChallengeUsers> challengeUsers = challengeUsersService.findChallengeUsersByChallengeId(id);
        return new ChallengeUsersListModel(challengeUsersMapper.toChallengeUsersModelList(challengeUsers));
    }

    @GetMapping("/user/{id}")
    public ChallengeUsersListModel findChallengeUsersByUserId(@PathVariable("id") Long id){
        List<ChallengeUsers> challengeUsers = challengeUsersService.findChallengeUsersByUserId(id);
        return new ChallengeUsersListModel(challengeUsersMapper.toChallengeUsersModelList(challengeUsers));

    }
}
