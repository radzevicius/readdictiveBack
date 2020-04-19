package com.radsoft.readdictive.controllers;

import com.radsoft.readdictive.controllers.models.ReviewModel;
import com.radsoft.readdictive.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/review/")
@CrossOrigin("http://192.168.1.248:3000")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/create")
    public void createReview(@RequestBody ReviewModel newReview){
        reviewService.createReview(ReviewModel.toInternal(newReview));
    }

    @GetMapping("/id/{id}")
    public ReviewModel searchReviewId(@PathVariable("id") Long id){
        return ReviewModel.toExternal(reviewService.getReviewById(id));
    }


}
