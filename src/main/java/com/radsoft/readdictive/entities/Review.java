package com.radsoft.readdictive.entities;


import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Long id;

    @Column(name="review_title")
    String reviewTitle;

    @Column(name="review_text")
    String reviewText;

    @Column(name="reviewer_id")
    Long reviewerId;

    @Column(name="review_score")
    int reviewScore;

    @Column(name="book_id")
    Long bookId;

    @Column(name="created_date")
    Date createdDate;

    public static class ReviewBuilder{
        Long id;
        String reviewTitle;
        String reviewText;
        Long reviewerId;
        int reviewScore;
        Long bookId;
        Date createdDate;

        public ReviewBuilder withId(Long id){
            this.id = id;
            return this;
        }

        public ReviewBuilder withReviewTitle(String reviewTitle){
            this.reviewTitle = reviewTitle;
            return this;
        }

        public ReviewBuilder withReviewText(String reviewText){
            this.reviewText = reviewTitle;
            return this;
        }

        public ReviewBuilder withReviewerId(Long reviewerId){
            this.reviewerId = reviewerId;
            return this;
        }

        public ReviewBuilder withReviewScore(int reviewScore){
            this.reviewScore = reviewScore;
            return this;
        }

        public ReviewBuilder withBookId(Long bookId){
            this.bookId = bookId;
            return this;
        }

        public ReviewBuilder withCreatedDate(Date createdDate){
            this.createdDate = createdDate;
            return this;
        }

        public Review build(){
            return new Review(this);
        }
    }

    public Review(ReviewBuilder reviewBuilder){
        this.id = reviewBuilder.id;
        this.reviewTitle = reviewBuilder.reviewTitle;
        this.reviewText =  reviewBuilder.reviewText;
        this.reviewerId = reviewBuilder.reviewerId;
        this.reviewScore = reviewBuilder.reviewScore;
        this.bookId =reviewBuilder.bookId;
        this.createdDate=reviewBuilder.createdDate;
    }

    public Review() {
    }

    public Long getId() {
        return id;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public String getReviewText() {
        return reviewText;
    }

    public Long getReviewerId() {
        return reviewerId;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public Long getBookId() {
        return bookId;
    }

    public Date getCreatedDate(){
        return createdDate;
    }
}
