package com.radsoft.readdictive.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="completed_books")
public class CompletedBooks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name ="user_id")
    User userId;

    @ManyToOne
    @JoinColumn(name ="book_id")
    Book bookId;

    @Column(name="completed_date")
    @Temporal(value= TemporalType.TIMESTAMP)
    Date completedDate;

    public static class CompletedBooksBuilder{
        Long id;
        User userId;
        Book bookId;

        public CompletedBooksBuilder withId(Long id){
            this.id =id;
            return this;
        }

        public CompletedBooksBuilder withUser(User userId){
            this.userId = userId;
            return this;
        }

        public CompletedBooksBuilder withBook(Book book){
            this.bookId = book;
            return this;
        }

        public CompletedBooks build() {
            return new CompletedBooks(this);
        }
    }

    public CompletedBooks(){}

    public CompletedBooks(CompletedBooksBuilder completedBooksBuilder){
        this.id = completedBooksBuilder.id;
        this.bookId = completedBooksBuilder.bookId;
        this.userId = completedBooksBuilder.userId;
    }

    public Long getId(){
        return id;
    }
    public User getUserId() {
        return userId;
    }

    public Book getBookId(){
        return bookId;
    }
}
