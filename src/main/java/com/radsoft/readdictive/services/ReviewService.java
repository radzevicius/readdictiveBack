package com.radsoft.readdictive.services;

import com.radsoft.readdictive.entities.Review;
import com.radsoft.readdictive.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    public void createReview(Review review){
        reviewRepository.save(review);
    }

    public Review getReviewById(Long id){
        return reviewRepository.findById(id).get();
    }

}
