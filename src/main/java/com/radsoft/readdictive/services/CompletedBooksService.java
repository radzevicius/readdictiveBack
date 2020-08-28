package com.radsoft.readdictive.services;

import com.radsoft.readdictive.controllers.models.CompletedBooksIdModel;
import com.radsoft.readdictive.controllers.models.CompletedBooksModel;
import com.radsoft.readdictive.entities.Book;
import com.radsoft.readdictive.entities.CompletedBooks;
import com.radsoft.readdictive.entities.User;
import com.radsoft.readdictive.repositories.CompletedBooksRepository;
import com.radsoft.readdictive.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompletedBooksService {

    @Autowired
    CompletedBooksRepository completedBooksRepository;

    @Autowired
    UserService userService;

    @Autowired
    BookService bookService;

    public void storeCompletedBooks(CompletedBooks newCompletedBooks){
        completedBooksRepository.save(newCompletedBooks);
    }

    public List<CompletedBooks> getAllCompletedBooks(){
        return completedBooksRepository.findAll();
    }

    public CompletedBooksModel toExternal(CompletedBooks completedBooks){
        CompletedBooksModel completedBooksModel = new CompletedBooksModel();
        completedBooksModel.setId(completedBooks.getId());
        completedBooksModel.setBook(bookService.getBookById(completedBooks.getBookId()));
        completedBooksModel.setUser(userService.getUserById(completedBooks.getUserId()));
        return completedBooksModel;
    }

}
