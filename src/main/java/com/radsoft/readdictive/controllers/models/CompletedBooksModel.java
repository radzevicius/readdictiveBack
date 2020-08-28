package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.Book;
import com.radsoft.readdictive.entities.CompletedBooks;
import com.radsoft.readdictive.entities.User;
import com.radsoft.readdictive.services.CompletedBooksService;
import org.springframework.beans.factory.annotation.Autowired;

public class CompletedBooksModel {

    private Long id;

    private User user;

    private Book book;

    public  Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static CompletedBooksModel toExternal(CompletedBooksModel completedBooksModel){
        return completedBooksModel;
    }


}
