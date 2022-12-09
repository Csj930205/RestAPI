package com.example.jpaexample.repository;

import com.example.jpaexample.domain.entity.FoodShop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodShopRepository extends JpaRepository<FoodShop, Long> {
}
