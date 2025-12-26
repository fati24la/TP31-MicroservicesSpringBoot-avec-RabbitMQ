package com.tp.microservicesmessagingconsumer.repository;

import com.tp.microservicesmessagingconsumer.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}