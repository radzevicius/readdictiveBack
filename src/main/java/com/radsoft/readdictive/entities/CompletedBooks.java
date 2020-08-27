package com.radsoft.readdictive.entities;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="completed_books")
public class CompletedBooks {

    @Id
    @EmbeddedId
    Long id;


    @MapsId("user_id")
    @JoinColumn(name ="user_id")
    Long userId;

    @MapsId("book_id")
    @JoinColumn(name ="book_id")
    Long bookId;

    @Column(name="completed_date")
    @Temporal(value= TemporalType.TIMESTAMP)
    Date completedDate;

    public static class CompletedBooksBuilder{
        Long id;
        Long userId;
        Long bookId;

        public CompletedBooksBuilder withId(Long id){
            this.id =id;
            return this;
        }

        public CompletedBooksBuilder withUser(Long userId){
            this.userId = userId;
            return this;
        }

        public CompletedBooksBuilder withBook(Long bookId){
            this.bookId = bookId;
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
    public Long getUserId() {
        return userId;
    }

    public Long getBookId(){
        return bookId;
    }
}
