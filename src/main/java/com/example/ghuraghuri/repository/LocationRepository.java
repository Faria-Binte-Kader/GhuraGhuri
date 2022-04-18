package com.example.ghuraghuri.repository;

import com.example.ghuraghuri.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location,Integer> {
    List<Location> findByNameContaining(String name);
    List<Location> findByDivisionContaining(String division);
}
