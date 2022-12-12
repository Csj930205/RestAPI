package com.example.jpaexample.service;

import com.example.jpaexample.domain.dto.FoodShopDto;
import com.example.jpaexample.domain.entity.FoodShop;
import com.example.jpaexample.repository.FoodShopRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodShopService {
    private final FoodShopRepository foodShopRepository;

    /*
    * 식당 전체 조회
    * */
    @Transactional
    public List<FoodShop> listShop() {
        return foodShopRepository.findAll();
    }

    /*
    * 식당 상세조회
    * */
    @Transactional
    public FoodShop detailShop(Long seq) {
        return foodShopRepository.findById(seq).orElseThrow(() -> new IllegalArgumentException("해당 정보가 없습니다."));
    }

    /*
    * 식당 등록
    * */
    @Transactional
    public FoodShop saveShop(FoodShopDto foodShopDto) {
        return foodShopRepository.save(foodShopDto.toEntity());
    }

}
