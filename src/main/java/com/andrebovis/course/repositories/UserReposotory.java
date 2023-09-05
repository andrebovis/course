package com.andrebovis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrebovis.course.entities.User;

public interface UserReposotory extends  JpaRepository<User, Long> {

}
