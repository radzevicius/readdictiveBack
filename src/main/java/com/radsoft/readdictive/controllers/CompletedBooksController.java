package com.radsoft.readdictive.controllers;

import com.radsoft.readdictive.controllers.models.CompletedBooksIdModel;
import com.radsoft.readdictive.controllers.models.CompletedBooksListModel;
import com.radsoft.readdictive.controllers.models.CompletedBooksModel;
import com.radsoft.readdictive.services.CompletedBooksService;
import com.radsoft.readdictive.services.CompletedBooksMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public CompletedBooksListModel searchAllCompletedBooks() throws Exception{
        return new CompletedBooksListModel(completedBooksMapper).makeList(completedBooksService.getAllCompletedBooks());
    }


    @GetMapping("/user/{id}")
    public CompletedBooksListModel searchUserCompletedBooks(@PathVariable("id") Long id) throws Exception{
        return new CompletedBooksListModel(completedBooksMapper).makeList(completedBooksService.findCompletedBooksByUserId(id));
    }

    @GetMapping("/book/{id}")
    public CompletedBooksListModel searchBookCompletedBooks(@PathVariable("id") Long id) throws Exception{
        return new CompletedBooksListModel(completedBooksMapper).makeList(completedBooksService.findCompletedBooksByBookId(id));
    }

}
