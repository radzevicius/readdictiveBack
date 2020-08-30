package com.radsoft.readdictive.controllers.models;

import java.util.List;

public class ChallengeBooksListModel {

    private List<ChallengeBooksModel> challengeBooksListModel;

    public ChallengeBooksListModel(List<ChallengeBooksModel> challengeBooksModelList){
        this.challengeBooksListModel = challengeBooksModelList;
    }

    public List<ChallengeBooksModel> getChallengeBooksListModel() {
        return challengeBooksListModel;
    }
}
