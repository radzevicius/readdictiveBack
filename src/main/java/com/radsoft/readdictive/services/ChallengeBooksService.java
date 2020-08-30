package com.radsoft.readdictive.services;

import com.radsoft.readdictive.entities.ChallengeBooks;
import com.radsoft.readdictive.exceptions.ExistsException;
import com.radsoft.readdictive.repositories.ChallengeBooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChallengeBooksService {

    @Autowired
    ChallengeBooksRepository challengeBooksRepository;

    @Autowired
    ChallengeService challengeService;

    @Autowired
    BookService bookService;

    public void storeChallengeBooks(ChallengeBooks challengeBooks){
        try {
            if (challengeBooksRepository.findByChallengeId(challengeBooks.getChallengeId()).contains(challengeBooks)) {
                throw new ExistsException("This combination already exists");
            } else {
                challengeBooksRepository.save(challengeBooks);
            }
        }catch(ExistsException exception){
            System.out.println(exception.getMessage());
        }
    }

    public List<ChallengeBooks> getAllChallengeBooks() {return challengeBooksRepository.findAll();}

    public List<ChallengeBooks> findChallengeBooksByChallengeId(Long challengeId){
        return challengeBooksRepository.findByChallengeId(challengeId);
    }

    public List<ChallengeBooks> findChallengeBooksByBookId(Long bookId){
        return challengeBooksRepository.findByBookId(bookId);
    }
}
