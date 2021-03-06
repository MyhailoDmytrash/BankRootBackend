package com.lab.application.repositories;

import com.lab.application.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
    Optional<User> getUserByEmail(String email);
    Boolean existsUserByEmail(String email);
}
