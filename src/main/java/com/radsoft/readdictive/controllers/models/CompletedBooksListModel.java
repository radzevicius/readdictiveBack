package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.CompletedBooks;

import java.util.List;
import java.util.stream.Collectors;

public class CompletedBooksListModel {

    private List<CompletedBooksModel> completedBooks;

    public CompletedBooksListModel(List<CompletedBooksModel> completedBooksModels){
        this.completedBooks = completedBooksModels;
    }

    public List<CompletedBooksModel> getCompletedBooks (){
        return completedBooks;
    }

    public static CompletedBooksListModel toExternal(List<CompletedBooks> completedBooks){
        return new CompletedBooksListModel(completedBooks.stream()
        .map(CompletedBooksModel::toExternal)
        .collect(Collectors.toList()));
    }
}
