package com.radsoft.readdictive.controllers.models;

import com.radsoft.readdictive.entities.Review;

import java.util.Date;

public class ReviewModel {

    private Long id;
    private String reviewTitle;
    private String reviewText;
    private Long reviewerId;
    private int reviewScore;
    private Long bookId;
    private Date createdDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public Long getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public Long getBookId(){
        return bookId;
    }
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public static ReviewModel toExternal(Review review){
        ReviewModel reviewModel = new ReviewModel();
        reviewModel.setId(review.getId());
        reviewModel.setBookId(review.getBookId());
        reviewModel.setReviewerId(review.getReviewerId());
        reviewModel.setReviewScore(review.getReviewScore());
        reviewModel.setReviewText(review.getReviewText());
        reviewModel.setReviewTitle(review.getReviewTitle());
        reviewModel.setCreatedDate(review.getCreatedDate());
        return reviewModel;
    }

    public static Review toInternal(ReviewModel reviewModel){
        return  new Review(
                reviewModel.getReviewTitle(),
                reviewModel.getReviewText(),
                reviewModel.getReviewerId(),
                reviewModel.getReviewScore(),
                reviewModel.getBookId(),
                reviewModel.getCreatedDate()
        );
    }


}
