package com.example.ghuraghuri.repository;

import com.example.ghuraghuri.model.PlanLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanLocationRepository extends JpaRepository<PlanLocation, Integer> {
}
