package com.radsoft.readdictive.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CompletedBooksKey implements Serializable {
    @Column(name = "user_id")
    Long userId;

    @Column(name="book_id")
    Long bookId;

    public CompletedBooksKey(){ }

    public CompletedBooksKey(Long userId , Long bookId){
        this.userId = userId;
        this.bookId = bookId;
    }

    public Long getBookId() {
        return bookId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompletedBooksKey that = (CompletedBooksKey) o;
        return userId.equals(that.userId) &&
                bookId.equals(that.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, bookId);
    }
}
