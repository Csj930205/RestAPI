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
@Table(name = "food_menu")
@NoArgsConstructor
public class FoodMenu extends Time{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "food_menu_seq")
    private Long seq;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_shop_seq")
    @JsonIgnore
    private FoodShop foodShop;

    private String name;

    private String cft;

    private String price;

    @Column(name = "del_yn")
    private char delYn;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modified_by")
    private String modifiedBy;


    @Builder
    public FoodMenu(Long seq, FoodShop foodShop, String name, String cft, String price, char delYn, String createdBy, String modifiedBy) {
        this.seq = seq;
        this.foodShop = foodShop;
        this.name = name;
        this.cft = cft;
        this.price = price;
        this.delYn = delYn;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
    }

}
