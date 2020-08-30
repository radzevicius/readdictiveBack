package com.radsoft.readdictive.services;

import com.radsoft.readdictive.controllers.models.CompletedBooksListModel;
import com.radsoft.readdictive.controllers.models.CompletedBooksModel;
import com.radsoft.readdictive.entities.CompletedBooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CompletedBooksMapper {

    @Autowired
    private BookService bookService;

    @Autowired
    private UserService userService;

    public CompletedBooksModel toCompletedBooksModel(CompletedBooks completedBooks){
        CompletedBooksModel completedBooksModel = new CompletedBooksModel();
        completedBooksModel.setId(completedBooks.getId());
        completedBooksModel.setBook(bookService.getBookById(completedBooks.getBookId()));
        completedBooksModel.setUser(userService.getUserById(completedBooks.getUserId()));
        return completedBooksModel;
    }

    public List<CompletedBooksModel> toCompletedBooksListModel(List<CompletedBooks> completedBooks){
        return  completedBooks.stream()
                .map(this::toCompletedBooksModel)
                .collect(Collectors.toList());
    }

}
