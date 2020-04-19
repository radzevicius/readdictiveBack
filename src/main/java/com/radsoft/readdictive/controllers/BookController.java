package com.radsoft.readdictive.controllers;

import com.radsoft.readdictive.controllers.models.BookListModel;
import com.radsoft.readdictive.controllers.models.BookModel;
import com.radsoft.readdictive.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
@CrossOrigin("http://192.168.1.248:3000")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/id/{id}")
    public BookModel searchBookId(@PathVariable("id") Long id) throws Exception{
        return BookModel.toExternal(bookService.getBookById(id));
    }

    @GetMapping("/title/{title}")
    public BookListModel searchBookTitle(@PathVariable("title") String title) throws Exception{
        return BookListModel.toExternal(bookService.getBooksByTitle(title));
    }

    @GetMapping("/author/{author}")
    public BookListModel searchBookAuthor(@PathVariable("author") String author) throws Exception{
        return BookListModel.toExternal(bookService.getBooksByAuthor(author));
    }

    @GetMapping("/isbn/{isbn}")
    public BookModel searchBookIsbn(@PathVariable("isbn") Long isbn) throws Exception{
        return BookModel.toExternal(bookService.getBookByIsbn(isbn));
    }

    @PostMapping("/create")
    public void createBook(@RequestBody BookModel newBook){
        bookService.createBook(BookModel.toInternal(newBook));
    }

}
