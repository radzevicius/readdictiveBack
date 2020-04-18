package com.radsoft.readdictive.repositories;

import com.radsoft.readdictive.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

    List<Book> findByTitle(String title);

    List<Book> findByAuthor(String author);

    Book findByIsbn(String isbn);
}
