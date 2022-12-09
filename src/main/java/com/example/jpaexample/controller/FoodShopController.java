package com.example.jpaexample.controller;

import com.example.jpaexample.domain.dto.FoodShopDto;
import com.example.jpaexample.domain.entity.FoodShop;
import com.example.jpaexample.service.FoodShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class FoodShopController {
    private final FoodShopService foodShopService;

    /*
    * 식당 전체 조회
    * */
    @GetMapping("/shop/list")
    public ResponseEntity<List<FoodShop>> listShop() {
        List<FoodShop> listShop = foodShopService.listShop();
        return new ResponseEntity<>(listShop, HttpStatus.OK);
    }

    /*
    * 식당 상세 조회
    * */
    @GetMapping("/shop/detail/{seq}")
    public ResponseEntity<FoodShop> detailShop(@PathVariable("seq") Long seq) {
        FoodShop detailList = foodShopService.detailShop(seq);
        return new ResponseEntity<>(detailList, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /*
    * 식당 저장
    * */
    @PostMapping("/shop/save")
    public FoodShop saveShop(@RequestBody FoodShopDto foodShopDto) {
        return foodShopService.saveShop(foodShopDto);
    }
}
