package com.andrebovis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrebovis.course.entities.Order;

public interface OrderRepository extends  JpaRepository<Order, Long> {

}
