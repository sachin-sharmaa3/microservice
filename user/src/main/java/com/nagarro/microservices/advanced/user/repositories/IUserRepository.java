package com.nagarro.microservices.advanced.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.microservices.advanced.user.models.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

}
