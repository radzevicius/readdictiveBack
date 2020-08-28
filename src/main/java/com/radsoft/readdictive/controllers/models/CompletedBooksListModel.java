package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.CompletedBooks;
import com.radsoft.readdictive.services.EntityMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class CompletedBooksListModel {


    private final EntityMapper entityMapper = new EntityMapper();

    private List<CompletedBooksModel> completedBooks;

    public CompletedBooksListModel(List<CompletedBooksModel> collect) {

    }


    public List<CompletedBooksModel> getCompletedBooks (){
        return completedBooks;
    }

    public CompletedBooksListModel makeList(List<CompletedBooks> completedBooks){
        return new CompletedBooksListModel(completedBooks.stream()
        .map(entityMapper::toCompletedBooksModel)
        .collect(Collectors.toList()));
    }
}
