package com.radsoft.readdictive.services;

import com.radsoft.readdictive.controllers.models.CompletedBooksIdModel;
import com.radsoft.readdictive.controllers.models.CompletedBooksModel;
import com.radsoft.readdictive.entities.Book;
import com.radsoft.readdictive.entities.CompletedBooks;
import com.radsoft.readdictive.entities.User;
import com.radsoft.readdictive.exceptions.ExistsException;
import com.radsoft.readdictive.repositories.CompletedBooksRepository;
import com.radsoft.readdictive.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompletedBooksService {

    @Autowired
    private CompletedBooksRepository completedBooksRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    public void storeCompletedBooks(CompletedBooks newCompletedBooks){
        try {
            if (completedBooksRepository.findByUserId(newCompletedBooks.getUserId()).contains(newCompletedBooks)) {
                throw new ExistsException("This combination already exists");
            } else {
                completedBooksRepository.save(newCompletedBooks);
            }
        }catch(ExistsException exception){
            System.out.println(exception.getMessage());
        }
    }

    public List<CompletedBooks> getAllCompletedBooks(){
        return completedBooksRepository.findAll();
    }

    public List<CompletedBooks> findCompletedBooksByUserId(Long userId){
        return  completedBooksRepository.findByUserId(userId);
    }

    public List<CompletedBooks> findCompletedBooksByBookId(Long bookId){
        return completedBooksRepository.findByBookId(bookId);
    }


}