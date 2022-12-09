package com.example.jpaexample.service;

import com.example.jpaexample.domain.dto.FoodMenuDto;
import com.example.jpaexample.domain.entity.FoodMenu;
import com.example.jpaexample.repository.FoodMenuRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodMenuService {
    private final FoodMenuRepository foodMenuRepository;

    /*
    * 메뉴 전체 조회
    * */
    @Transactional
    public List<FoodMenu> menuList() {
        return foodMenuRepository.findAll();
    }

    /*
    * 메뉴 개별 조회
    * */
    @Transactional
    public FoodMenu menuDetailList(Long seq) {
        FoodMenu menuDetailList = foodMenuRepository.findById(seq).orElseThrow();
        return menuDetailList;
    }

    /*
    * 메뉴 등록
    * */
    @Transactional
    public FoodMenu saveMenu(FoodMenuDto foodMenuDto) {
        return foodMenuRepository.save(foodMenuDto.toEntity());
    }
}
