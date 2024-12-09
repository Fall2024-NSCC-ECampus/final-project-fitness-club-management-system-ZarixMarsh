package com.example.assignment2.repository;

import com.example.assignment2.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    // Custom query methods (if needed) can be added here
}
