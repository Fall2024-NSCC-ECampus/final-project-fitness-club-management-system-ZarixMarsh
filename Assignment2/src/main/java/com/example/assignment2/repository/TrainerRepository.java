package com.example.assignment2.repository;

import com.example.assignment2.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Long> {
    // Custom query methods (if needed) can be added here
}
