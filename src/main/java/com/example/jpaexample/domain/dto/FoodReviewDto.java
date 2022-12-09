package com.example.jpaexample.domain.dto;

import com.example.jpaexample.domain.entity.FoodMenu;
import com.example.jpaexample.domain.entity.FoodReview;
import com.example.jpaexample.domain.entity.FoodShop;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class FoodReviewDto {
    private FoodShop foodShop;
    private FoodMenu foodMenu;
    private String title;
    private String content;
    private char delYn;
    private String createdBy;
    private LocalDateTime createdDate;
    private String modifiedBy;
    private LocalDateTime modifiedDate;

    @Builder
    public FoodReviewDto(FoodShop foodShop, FoodMenu foodMenu, String title, String content, char delYn,
                         String createdBy, LocalDateTime createdDate, String modifiedBy, LocalDateTime modifiedDate) {
        this.foodShop = foodShop;
        this.foodMenu = foodMenu;
        this.title = title;
        this.content = content;
        this.delYn = delYn;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }

    public FoodReview toEntity() {
        return FoodReview.builder()
                .foodShop(foodShop)
                .foodMenu(foodMenu)
                .title(title)
                .content(content)
                .delYn(delYn)
                .createdBy(createdBy)
                .modifiedBy(modifiedBy)
                .build();
    }
}
