package com.example.jpaexample.domain.dto;

import com.example.jpaexample.domain.entity.FoodShop;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class FoodShopDto {
    private String name;
    private Long latitude;
    private Long longitude;
    private char delYn;
    private String createdBy;
    private LocalDateTime createdDate;
    private String modifiedBy;
    private LocalDateTime modifiedDate;


    @Builder
    public FoodShopDto(String name, Long latitude, Long longitude, char delYn, String createdBy, LocalDateTime createdDate, String modifiedBy, LocalDateTime modifiedDate) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.delYn = delYn;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }

    public FoodShop toEntity() {
        return FoodShop.builder()
                .name(name)
                .latitude(latitude)
                .longitude(longitude)
                .delYn(delYn)
                .createdBy(createdBy)
                .modifiedBy(modifiedBy)
                .build();
    }
}
