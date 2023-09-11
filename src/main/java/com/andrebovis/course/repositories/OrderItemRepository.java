package com.andrebovis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrebovis.course.entities.OrderItem;

public interface OrderItemRepository extends  JpaRepository<OrderItem , Long> {

}
