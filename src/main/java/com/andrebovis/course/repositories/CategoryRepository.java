package com.andrebovis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrebovis.course.entities.Category;

public interface CategoryRepository extends  JpaRepository<Category, Long> {

}
