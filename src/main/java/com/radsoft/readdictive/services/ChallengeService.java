package com.radsoft.readdictive.services;

import com.radsoft.readdictive.entities.Challenge;
import com.radsoft.readdictive.repositories.ChallengeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChallengeService {

    @Autowired
    private ChallengeRepository challengeRepository;

    public void createChallenge(Challenge challenge){
        challengeRepository.save(challenge);
    }

    public Challenge getChallengeById(Long id){
        return challengeRepository.findById(id).get();
    }

    public List<Challenge> getChallengesByName(String name){
        return challengeRepository.findByNameContaining(name);

    }

    public List<Challenge> getChallengesAll(){
        return challengeRepository.findAll();
    }

    public void deleteChallengeId(Long id){
        challengeRepository.deleteById(id);
    }

    public void updateChallengeId(Long id, Challenge challenge) {
        Challenge challengeToUpdate = getChallengeById(id);
    }


}
