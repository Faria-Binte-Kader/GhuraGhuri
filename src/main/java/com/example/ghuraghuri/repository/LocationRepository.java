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
  /*  List<Location> findByNameContaining(String name);
    List<Location> findByDivisionContaining(String division);*/
  List<Location> findByOrderByNameAsc();
  List<Location> findByOrderByNameDesc();
  List<Location> findByName(String name);
  List<Location> findByDivisionOrderByNameAsc(String division);
  List<Location> findByDivisionOrderByNameDesc(String division);
  List<Location> findByTypeOrderByNameAsc(String division);
  List<Location> findByTypeOrderByNameDesc(String division);
  List<Location> findByDivisionAndTypeOrderByNameAsc(String division, String type);
  List<Location> findByDivisionAndTypeOrderByNameDesc(String division, String type);

}
