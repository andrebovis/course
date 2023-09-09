package com.andrebovis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrebovis.course.entities.Product;

public interface ProductRepository extends  JpaRepository<Product, Long> {

}
