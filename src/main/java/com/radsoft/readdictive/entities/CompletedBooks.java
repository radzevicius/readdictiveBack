package com.radsoft.readdictive.entities;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="completed_books")
public class CompletedBooks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Long id;

    @JoinColumn(name ="user_id")
    Long userId;


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

        public CompletedBooksBuilder withUserId(Long userId){
            this.userId = userId;
            return this;
        }

        public CompletedBooksBuilder withBookId(Long bookId){
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompletedBooks that = (CompletedBooks) o;
        return userId.equals(that.userId) &&
                bookId.equals(that.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, bookId);
    }
}
