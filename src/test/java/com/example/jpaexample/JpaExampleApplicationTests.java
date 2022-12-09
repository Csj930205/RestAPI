package com.example.jpaexample;

import com.example.jpaexample.domain.dto.FoodMenuDto;
import com.example.jpaexample.domain.dto.FoodReviewDto;
import com.example.jpaexample.domain.entity.FoodMenu;
import com.example.jpaexample.domain.entity.FoodReview;
import com.example.jpaexample.domain.entity.FoodShop;
import com.example.jpaexample.repository.FoodMenuRepository;
import com.example.jpaexample.repository.FoodReviewRepository;
import com.example.jpaexample.repository.FoodShopRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class JpaExampleApplicationTests {
    @Autowired
    FoodShopRepository foodShopRepository;

    @Autowired
    FoodMenuRepository foodMenuRepository;

    @Autowired
    FoodReviewRepository foodReviewRepository;

    @Test
    void contextLoads() {
        List<FoodShop> foodShop =  foodShopRepository.findAll();
        System.out.println(foodShop.get(1));
    }
}
