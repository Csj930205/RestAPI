package com.example.jpaexample.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "food_shop")
@NoArgsConstructor
public class FoodShop extends Time{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "food_shop_seq")
    private Long seq;

    private String name;

    private Long latitude;

    private Long longitude;

    @Column(name = "del_yn")
    private char delYn;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modified_by")
    private String modifiedBy;

    @OneToMany(mappedBy = "foodShop", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JsonIgnore
    private List<FoodMenu> foodMenuList = new ArrayList<>();

    @OneToMany(mappedBy = "foodShop", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JsonIgnore
    private List<FoodReview> foodReviewList = new ArrayList<>();

    @Builder
    public FoodShop(Long seq, String name, Long latitude, Long longitude, char delYn, String createdBy, String modifiedBy) {
        this.seq = seq;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.delYn = delYn;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
    }
}
