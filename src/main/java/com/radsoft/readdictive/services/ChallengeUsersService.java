package com.radsoft.readdictive.services;

import com.radsoft.readdictive.entities.ChallengeUsers;
import com.radsoft.readdictive.entities.CompletedBooks;
import com.radsoft.readdictive.exceptions.ExistsException;
import com.radsoft.readdictive.repositories.ChallengeUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ChallengeUsersService {

    @Autowired
    private ChallengeUsersRepository challengeUsersRepository;

    public void storeChallengeUsers(ChallengeUsers newChallengeUsers){
        try {
            if (challengeUsersRepository.findByChallengeId(newChallengeUsers.getChallengeId()).contains(newChallengeUsers)) {
                throw new ExistsException("This combination already exists");
            } else {
                challengeUsersRepository.save(newChallengeUsers);
            }
        }catch(ExistsException exception){
            System.out.println(exception.getMessage());
        }
    }

    public List<ChallengeUsers>  getAllChallengeUsers(){
        return challengeUsersRepository.findAll();
    }

    public List<ChallengeUsers> findChallengeUsersByChallengeId(Long id){
        return challengeUsersRepository.findByChallengeId(id);
    }

    public List<ChallengeUsers> findChallengeUsersByUserId(Long id){
        return challengeUsersRepository.findByUserId(id);
    }
}
