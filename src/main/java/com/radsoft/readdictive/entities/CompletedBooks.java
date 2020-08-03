package com.radsoft.readdictive.entities;

import javax.persistence.*;

@Entity
@Table(name="completed_books")
public class CompletedBooks {
    @EmbeddedId
    CompletedBooksKey id;

    @ManyToMany
    @MapsId("user_id")
    @JoinColumn(name ="user_id")
    User user;

    @ManyToMany
    @MapsId("book_id")
    @JoinColumn(name ="book_id")
    Book book;

}
