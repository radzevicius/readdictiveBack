package com.radsoft.readdictive.services;

import com.radsoft.readdictive.controllers.models.CompletedBooksModel;
import com.radsoft.readdictive.entities.CompletedBooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EntityMapper {

    @Autowired
    BookService bookService;

    @Autowired
    UserService userService;

    public CompletedBooksModel toCompletedBooksModel(CompletedBooks completedBooks){
        CompletedBooksModel completedBooksModel = new CompletedBooksModel();
        completedBooksModel.setId(completedBooks.getId());
        completedBooksModel.setBook(bookService.getBookById(completedBooks.getBookId()));
        completedBooksModel.setUser(userService.getUserById(completedBooks.getUserId()));
        return completedBooksModel;
    }

}
