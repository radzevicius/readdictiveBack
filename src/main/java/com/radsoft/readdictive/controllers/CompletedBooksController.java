package com.radsoft.readdictive.controllers;

import com.radsoft.readdictive.controllers.models.CompletedBooksIdModel;
import com.radsoft.readdictive.controllers.models.CompletedBooksListModel;
import com.radsoft.readdictive.entities.CompletedBooks;
import com.radsoft.readdictive.services.CompletedBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/completions")
@CrossOrigin("http://192.168.1.248:3000")
public class CompletedBooksController {

    @Autowired
    CompletedBooksService completedBooksService;


    @PostMapping("/create")
    public void createCompletedBooks(@RequestBody CompletedBooksIdModel newCompletedBooks){
        completedBooksService.storeCompletedBooks(CompletedBooksIdModel.toInternal(newCompletedBooks));
    }

//    @GetMapping("/all")
//    public CompletedBooksListModel searchAllCompletedBooks() throws Exception{
//
//    }
}
