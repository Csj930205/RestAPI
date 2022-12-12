package com.example.jpaexample.service;

import com.example.jpaexample.domain.dto.FoodReviewDto;
import com.example.jpaexample.domain.entity.FoodReview;
import com.example.jpaexample.repository.FoodReviewRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodReviewService {
    private final FoodReviewRepository foodReviewRepository;

    /*
    * 리뷰 전체조회
    * */
    public List<FoodReview> reviewList() {
        return foodReviewRepository.findAll();
    }

    /*
    * 리뷰 개별조회
    * */
    public FoodReview reviewDetailList(Long seq) {
        FoodReview reviewDetailList = foodReviewRepository.findById(seq).orElseThrow(() -> new IllegalArgumentException("해당 정보가 없습니다."));
        return reviewDetailList;
    }

    /*
    * 리뷰 저장
    * */
    @Transactional
    public FoodReview saveReview(FoodReviewDto foodReviewDto) {
        return foodReviewRepository.save(foodReviewDto.toEntity());
    }
}
