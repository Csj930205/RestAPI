package com.example.jpaexample.controller;

import com.example.jpaexample.domain.dto.FoodMenuDto;
import com.example.jpaexample.domain.entity.FoodMenu;
import com.example.jpaexample.domain.entity.FoodShop;
import com.example.jpaexample.service.FoodMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class FoodMenuController {
    private final FoodMenuService foodMenuService;

    /*
    * 메뉴 전체 조회
    * */
    @GetMapping("/menu/list")
    public ResponseEntity<List<FoodMenu>> menuList() {
        List<FoodMenu> menuList = foodMenuService.menuList();
        return new ResponseEntity<>(menuList, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /*
    * 메뉴 개별 조회
    * */
    @GetMapping("/menu/detail/{seq}")
    public ResponseEntity<FoodMenu> menuDetailList(@PathVariable("seq") Long seq) {
        FoodMenu menuDetailList = foodMenuService.menuDetailList(seq);
        return new ResponseEntity<>(menuDetailList, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /*
    * 메뉴 등록
    * */
    @PostMapping("/menu/save")
    public ResponseEntity<FoodMenu> saveMenu(@RequestBody FoodMenuDto foodMenuDto) {
        FoodMenu saveMenu = foodMenuService.saveMenu(foodMenuDto);
        return new ResponseEntity<>(saveMenu, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
