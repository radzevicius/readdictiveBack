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

    public Review(String reviewTitle, String reviewText, Long reviewerId, int reviewScore, Long bookId, Date createdDate){
        this.reviewTitle=reviewTitle;
        this.reviewText =reviewText;
        this.reviewerId = reviewerId;
        this.reviewScore = reviewScore;
        this.bookId =bookId;
        this.createdDate=createdDate;
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
