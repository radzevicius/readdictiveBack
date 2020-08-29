package com.radsoft.readdictive.controllers.models;
import com.radsoft.readdictive.entities.CompletedBooks;
import com.radsoft.readdictive.services.CompletedBooksMapper;
import java.util.List;
import java.util.stream.Collectors;

public class CompletedBooksListModel {

    private final CompletedBooksMapper completedBooksMapper;

    public CompletedBooksListModel(CompletedBooksMapper completedBooksMapper){
        this.completedBooksMapper = completedBooksMapper;
    }

    private List<CompletedBooksModel> completedBooksModelList;


    public CompletedBooksListModel(CompletedBooksMapper completedBooksMapper, List<CompletedBooksModel> completedBooksModelList) {
        this.completedBooksMapper = completedBooksMapper;
        this.completedBooksModelList =completedBooksModelList;
    }


    public List<CompletedBooksModel> getCompletedBooks (){
        return completedBooksModelList;
    }

    public  CompletedBooksListModel makeList(List<CompletedBooks> completedBooks){
        System.out.println();
        return  new CompletedBooksListModel(completedBooksMapper, completedBooks.stream()
        .map(completedBooksMapper::toCompletedBooksModel)
        .collect(Collectors.toList()));
    }
}
