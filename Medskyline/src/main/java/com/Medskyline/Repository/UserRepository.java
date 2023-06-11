package com.Medskyline.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Medskyline.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByUserTypeAndStatus(String userType, String status);
    List<User> findByDateOfBirthBetweenAndStatus(LocalDate startDate, LocalDate endDate, String status);
}
