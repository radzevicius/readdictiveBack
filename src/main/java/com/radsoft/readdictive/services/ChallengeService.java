package com.radsoft.readdictive.services;

import com.radsoft.readdictive.entities.Challenge;
import com.radsoft.readdictive.repositories.ChallengeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChallengeService {

    @Autowired
    ChallengeRepository challengeRepository;

    public void createChallenge(Challenge challenge){
        challengeRepository.save(challenge);
    }

    public Challenge getChallengeById(Long id){
        return challengeRepository.findById(id).get();
    }


}
