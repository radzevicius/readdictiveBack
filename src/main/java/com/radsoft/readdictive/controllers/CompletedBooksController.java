package com.radsoft.readdictive.controllers;

import com.radsoft.readdictive.controllers.models.CompletedBooksIdModel;
import com.radsoft.readdictive.controllers.models.CompletedBooksListModel;
import com.radsoft.readdictive.controllers.models.CompletedBooksModel;
import com.radsoft.readdictive.entities.CompletedBooks;
import com.radsoft.readdictive.services.CompletedBooksService;
import com.radsoft.readdictive.services.CompletedBooksMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/completions")
@CrossOrigin("http://192.168.1.248:3000")
public class CompletedBooksController {

    @Autowired
    CompletedBooksService completedBooksService;

    @Autowired
    CompletedBooksMapper completedBooksMapper;


    @PostMapping("/create")
    public void createCompletedBooks(@RequestBody CompletedBooksIdModel newCompletedBooks) {
        completedBooksService.storeCompletedBooks(CompletedBooksIdModel.toInternal(newCompletedBooks))
        ;
    }

    @GetMapping("/all")
    public CompletedBooksListModel searchAllCompletedBooks(){
        List<CompletedBooks> allCompletedBooks = completedBooksService.getAllCompletedBooks();
        return new CompletedBooksListModel(completedBooksMapper.toCompletedBooksListModel(allCompletedBooks));
    }


    @GetMapping("/user/{id}")
    public CompletedBooksListModel searchUserCompletedBooks(@PathVariable("id") Long id){
        List<CompletedBooks> userCompletedBooks = completedBooksService.findCompletedBooksByUserId(id);
        return new CompletedBooksListModel(completedBooksMapper.toCompletedBooksListModel(userCompletedBooks));
    }

    @GetMapping("/book/{id}")
    public CompletedBooksListModel searchBookCompletedBooks(@PathVariable("id") Long id){
        List<CompletedBooks> completedBooksList = completedBooksService.findCompletedBooksByBookId(id);
        return new CompletedBooksListModel(completedBooksMapper.toCompletedBooksListModel(completedBooksList));
    }
}
