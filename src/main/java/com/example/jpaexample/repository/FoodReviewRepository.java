package com.example.jpaexample.repository;

import com.example.jpaexample.domain.entity.FoodReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodReviewRepository extends JpaRepository<FoodReview, Long> {
}
