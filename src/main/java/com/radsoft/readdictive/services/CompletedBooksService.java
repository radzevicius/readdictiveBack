package com.radsoft.readdictive.services;

import com.radsoft.readdictive.controllers.models.CompletedBooksIdModel;
import com.radsoft.readdictive.entities.Book;
import com.radsoft.readdictive.entities.CompletedBooks;
import com.radsoft.readdictive.entities.User;
import com.radsoft.readdictive.repositories.CompletedBooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompletedBooksService {
    @Autowired
    CompletedBooksRepository completedBooksRepository;

    UserService userService;
    BookService bookService;

    public void createCompletedBooks(CompletedBooks newCompletedBooks){
        completedBooksRepository.save(newCompletedBooks);
    }

    public List<CompletedBooks> getAllCompletedBooks(){
        return completedBooksRepository.findAll();
    }

    public CompletedBooks buildCompletedBooks(CompletedBooksIdModel completedBooksIdModel){
        System.out.println(completedBooksIdModel.getUserId());
        User user = userService.getUserById(completedBooksIdModel.getUserId());
        Book book = bookService.getBookById(completedBooksIdModel.getBookId());
        return new CompletedBooks.CompletedBooksBuilder()
                .withUser(user)
                .withBook(book)
                .build();
    }
}
