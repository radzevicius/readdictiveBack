package com.radsoft.readdictive.repositories;

import com.radsoft.readdictive.entities.Book;
import com.radsoft.readdictive.entities.CompletedBookId;
import com.radsoft.readdictive.entities.CompletedBooks;
import com.radsoft.readdictive.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompletedBooksRepository extends JpaRepository<CompletedBooks, CompletedBookId> {

    List<CompletedBooks> findByUserId(Long userId);
    List<CompletedBooks> findByBookId(Long bookId);

}
