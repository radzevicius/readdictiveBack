package com.radsoft.readdictive.services;

import com.radsoft.readdictive.entities.Book;
import com.radsoft.readdictive.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;


    public  void createBook(Book newBook){
         bookRepository.save(newBook);
    }


    public Book getBookById(long id){
        return bookRepository.findById(id).get();
    }

    public Book getBookByIsbn(String isbn){
        return bookRepository.findByIsbn(isbn);
    }

    public List<Book> getBooksByTitle(String title){
       return bookRepository.findByTitle(title);
    }

    public List<Book> getBooksByAuthor(String author){
        return bookRepository.findByAuthor(author);
    }

}
