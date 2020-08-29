package com.radsoft.readdictive.entities;


import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CompletedBookId implements Serializable {
    private Long userId;
    private Long bookId;

    public CompletedBookId(Long userId, Long bookId){
        this.bookId =bookId;
        this.userId = userId;
    }

    public CompletedBookId(){}

    public Long getUserId(){return userId;}

    public void setUserId(Long userId){ this.userId= userId;}

    public Long getBookId(){return bookId;}

    public void setBookId(Long bookId){this.bookId = bookId;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompletedBookId that = (CompletedBookId) o;
        return userId.equals(that.userId) &&
                bookId.equals(that.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, bookId);
    }
}
