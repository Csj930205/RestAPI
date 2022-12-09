package com.example.jpaexample.controller;

import com.example.jpaexample.domain.entity.FoodReview;
import com.example.jpaexample.service.FoodReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class FoodReviewController {
    private final FoodReviewService foodReviewService;

    /*
    * 리뷰 전체조회
    * */
    @GetMapping("/review/list")
    public ResponseEntity<List<FoodReview>> reviewList() {
        List<FoodReview> foodReviewList = foodReviewService.reviewList();
        return new ResponseEntity<>(foodReviewList, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /*
    * 리뷰 개별조회
    * */
    @GetMapping("/review/detail/{seq}")
    public ResponseEntity<FoodReview> reviewDetailList(@PathVariable("seq") Long seq) {
        FoodReview reviewDetailList = foodReviewService.reviewDetailList(seq);
        return new ResponseEntity<>(reviewDetailList, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
