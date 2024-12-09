package com.example.assignment2.repository;

import com.example.assignment2.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    // Custom query methods (if needed) can be added here
}
