package com.danyrodrigues.jparepository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danyrodrigues.jparepository.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {

}
