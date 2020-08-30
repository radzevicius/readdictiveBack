package com.radsoft.readdictive.controllers.models;
import com.radsoft.readdictive.entities.CompletedBooks;
import com.radsoft.readdictive.services.CompletedBooksMapper;
import java.util.List;
import java.util.stream.Collectors;

public class CompletedBooksListModel {

    private List<CompletedBooksModel> completedBooksModelList;

    public CompletedBooksListModel(List<CompletedBooksModel> completedBooksModelList) {
        this.completedBooksModelList =completedBooksModelList;
    }

    public List<CompletedBooksModel> getCompletedBooks (){
        return completedBooksModelList;
    }


}
