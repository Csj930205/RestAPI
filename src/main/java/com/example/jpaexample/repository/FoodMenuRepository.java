package com.example.jpaexample.repository;

import com.example.jpaexample.domain.entity.FoodMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodMenuRepository extends JpaRepository<FoodMenu, Long> {
}
