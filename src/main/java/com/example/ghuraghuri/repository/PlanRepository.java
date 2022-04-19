package com.example.ghuraghuri.repository;

import com.example.ghuraghuri.model.Plan;
import com.example.ghuraghuri.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public interface PlanRepository extends JpaRepository<Plan,Integer> {
    List<Plan> findByEmail(String email);
    List<Plan> findById(Long id);
}
