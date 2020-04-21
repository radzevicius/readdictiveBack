package com.radsoft.readdictive.controllers;

import com.radsoft.readdictive.controllers.models.ChallengeListModel;
import com.radsoft.readdictive.controllers.models.ChallengeModel;
import com.radsoft.readdictive.entities.Challenge;
import com.radsoft.readdictive.services.ChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/challenge")
@CrossOrigin("http://192.168.1.248:3000")
public class ChallengeController {

    @Autowired
    ChallengeService challengeService;

    @PostMapping("/create")
    public void createChallenge(@RequestBody ChallengeModel challenge){
        challengeService.createChallenge(ChallengeModel.toInternal(challenge));
    }

    @GetMapping("/id/{id}")
    public ChallengeModel searchChallengeId(@PathVariable("id") Long id){
        return ChallengeModel.toExternal(challengeService.getChallengeById(id));
    }

    @GetMapping("/name/{name}")
    public ChallengeListModel searchChallengesName(@PathVariable("name") String  name){
        return ChallengeListModel.toExternal(challengeService.getChallengesByName(name));
    }

    @GetMapping("/all")
    public ChallengeListModel allChallenges(){
        return ChallengeListModel.toExternal(challengeService.getChallengesAll());
    }

    @DeleteMapping("/delete/{id}")
    public void deleteChallengeId(@PathVariable("id") Long id){
        challengeService.deleteChallengeId(id);
    }



}
