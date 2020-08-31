package com.radsoft.readdictive.controllers;


import com.radsoft.readdictive.controllers.models.ChallengeBooksIdModel;
import com.radsoft.readdictive.controllers.models.ChallengeBooksListModel;
import com.radsoft.readdictive.controllers.models.ChallengeBooksModel;
import com.radsoft.readdictive.entities.ChallengeBooks;
import com.radsoft.readdictive.services.ChallengeBooksMapper;
import com.radsoft.readdictive.services.ChallengeBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/challenge/books")
@CrossOrigin("http://192.168.1.248:3000")
public class ChallengeBooksController {

    @Autowired
    private ChallengeBooksMapper challengeBooksMapper;

    @Autowired
    private ChallengeBooksService challengeBooksService;

    @PostMapping("/create")
    public void createChallengeBook(@RequestBody ChallengeBooksIdModel challengeBooksIdModel){
        ChallengeBooks challengeBooks = ChallengeBooksIdModel.toInternal(challengeBooksIdModel);
        challengeBooksService.storeChallengeBooks(challengeBooks);
    }

    @GetMapping("/all")
    public ChallengeBooksListModel searchAllChallengeBooks(){
        List<ChallengeBooks> allChallengeBooks = challengeBooksService.getAllChallengeBooks();
        return new ChallengeBooksListModel(challengeBooksMapper.toChallengeBooksModelList(allChallengeBooks));
    }

    @GetMapping("/challenge/{id}")
    public ChallengeBooksListModel searchChallengeBooksByChallengeId(@PathVariable("id") Long id){
        List<ChallengeBooks> challengeBooksByChallengeId = challengeBooksService.findChallengeBooksByChallengeId(id);
        return new ChallengeBooksListModel(challengeBooksMapper.toChallengeBooksModelList(challengeBooksByChallengeId));
    }

    @GetMapping("/book/{id}")
    public ChallengeBooksListModel searchChallengeBooksByBookId(@PathVariable("id") Long id){
        List<ChallengeBooks> challengeBooksByBookId = challengeBooksService.findChallengeBooksByBookId(id);
        return new ChallengeBooksListModel(challengeBooksMapper.toChallengeBooksModelList(challengeBooksByBookId));
    }
}
