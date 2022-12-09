package com.example.jpaexample.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "food_review")
@NoArgsConstructor
public class FoodReview extends Time{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_shop_seq")
    @JsonIgnore
    private FoodShop foodShop;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_menu_seq")
    @JsonIgnore
    private FoodMenu foodMenu;

    @Column(length = 50)
    private String title;
    private String content;

    @Column(name = "del_yn")
    private char delYn;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Builder
    public FoodReview(FoodShop foodShop, FoodMenu foodMenu, String title, String content, char delYn,
                      String createdBy, String modifiedBy) {
        this.foodShop = foodShop;
        this.foodMenu = foodMenu;
        this.title = title;
        this.content = content;
        this.delYn = delYn;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
    }
}
