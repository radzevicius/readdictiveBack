package com.radsoft.readdictive.controllers;

import com.radsoft.readdictive.controllers.models.CompletedBooksIdModel;
import com.radsoft.readdictive.controllers.models.CompletedBooksListModel;
import com.radsoft.readdictive.controllers.models.CompletedBooksModel;
import com.radsoft.readdictive.entities.CompletedBooks;
import com.radsoft.readdictive.services.CompletedBooksService;
import com.radsoft.readdictive.services.EntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/completions")
@CrossOrigin("http://192.168.1.248:3000")
public class CompletedBooksController {

    @Autowired
    CompletedBooksService completedBooksService;

    @Autowired
    EntityMapper entityMapper;


    @PostMapping("/create")
    public void createCompletedBooks(@RequestBody CompletedBooksIdModel newCompletedBooks){
        completedBooksService.storeCompletedBooks(CompletedBooksIdModel.toInternal(newCompletedBooks));
    }

//    @GetMapping("/all")
//    public CompletedBooksListModel searchAllCompletedBooks() throws Exception{
//
//    }

    @GetMapping("/id/{id}")
    public CompletedBooksModel searchCompletedBookId(@PathVariable("id") Long id) throws Exception{
        return entityMapper.toCompletedBooksModel(completedBooksService.findCompletedBookById(id));
    }
}
