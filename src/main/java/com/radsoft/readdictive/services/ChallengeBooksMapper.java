package com.radsoft.readdictive.services;

import com.radsoft.readdictive.controllers.models.ChallengeBooksModel;
import com.radsoft.readdictive.entities.ChallengeBooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ChallengeBooksMapper {

    @Autowired
    private ChallengeService challengeService;

    @Autowired
    private BookService bookService;



    public ChallengeBooksModel toChallengeBooksModel(ChallengeBooks challengeBooks){
        ChallengeBooksModel challengeBooksModel = new ChallengeBooksModel();
        challengeBooksModel.setId(challengeBooks.getId());
        challengeBooksModel.setChallenge(challengeService.getChallengeById(challengeBooks.getId()));
        challengeBooksModel.setBook(bookService.getBookById(challengeBooks.getBookId()));
        return challengeBooksModel;
    }

    public List<ChallengeBooksModel> toChallengeBooksModelList(List<ChallengeBooks> challengeBooks){
        return challengeBooks.stream()
                .map(this::toChallengeBooksModel)
                .collect(Collectors.toList());
    }

}
