package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.Book;

import java.util.List;
import java.util.stream.Collectors;

public class BookListModel {

    private List<BookModel> books;

    public BookListModel(List<BookModel> books){
        this.books =books;
    }

    public  List<BookModel> getBookListModel(){
        return books;
    }

    public static BookListModel toExternal(List<Book> books){
        return new BookListModel(books.stream()
            .map(BookModel::toExternal)
            .collect(Collectors.toList()));
    }
}
