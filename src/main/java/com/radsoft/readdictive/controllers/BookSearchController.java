package com.radsoft.readdictive.controllers;

import com.radsoft.readdictive.entities.Book;
import com.radsoft.readdictive.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://192.168.1.248:3000")
public class BookSearchController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/book/{name}")
    public String searchBookName(@PathVariable("name") String query) throws Exception{
        bookRepository.save(new Book("Name of the wind", "Patrick Rothfuss",5444,"labai gera knyga"));
        return String.format("You searched for %s", query);
    }

}
