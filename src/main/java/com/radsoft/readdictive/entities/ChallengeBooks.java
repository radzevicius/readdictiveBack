package com.radsoft.readdictive.entities;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "challenge_books")
public class ChallengeBooks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="challenge_id")
    Long challengeId;

    @Column(name="book_id")
    Long bookId;

    public static class ChallengeBooksBuilder{
        Long id;
        Long challengeId;
        Long bookId;

        public ChallengeBooksBuilder withId(Long id){
            this.id = id;
            return this;
        }

        public ChallengeBooksBuilder withChallengeId(Long challengeId){
            this.challengeId = challengeId;
            return this;
        }

        public ChallengeBooksBuilder withBookId(Long bookId){
            this.bookId = bookId;
            return this;
        }

        public ChallengeBooks build(){return new ChallengeBooks(this);}
    }

    public ChallengeBooks(){}

    public ChallengeBooks(ChallengeBooksBuilder challengeBooksBuilder){
        this.id = challengeBooksBuilder.id;
        this.challengeId = challengeBooksBuilder.challengeId;
        this.bookId = challengeBooksBuilder.bookId;
    }

    public Long getId() {return id;}

    public Long getChallengeId(){return challengeId;}

    public Long getBookId(){return bookId;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChallengeBooks that = (ChallengeBooks) o;
        return challengeId.equals(that.challengeId) &&
                bookId.equals(that.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(challengeId, bookId);
    }
}
