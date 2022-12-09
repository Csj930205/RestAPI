package com.example.jpaexample.domain.dto;

import com.example.jpaexample.domain.entity.FoodMenu;
import com.example.jpaexample.domain.entity.FoodShop;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class FoodMenuDto {
    private FoodShop foodShop;
    private String name;
    private String cft;
    private String price;
    private char delYn;
    private String createdBy;
    private LocalDateTime createdDate;
    private String modifiedBy;
    private LocalDateTime modifiedDate;

    @Builder
    public FoodMenuDto(FoodShop foodShop, String name, String cft, String price, char delYn, String createdBy, LocalDateTime createdDate, String modifiedBy, LocalDateTime modifiedDate) {
        this.foodShop = foodShop;
        this.name = name;
        this.cft = cft;
        this.price = price;
        this.delYn = delYn;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }

    public FoodMenu toEntity() {
        return FoodMenu.builder()
                .foodShop(foodShop)
                .name(name)
                .cft(cft)
                .price(price)
                .delYn(delYn)
                .createdBy(createdBy)
                .modifiedBy(modifiedBy)
                .build();
    }
}
