package com.example.ghuraghuri.repository;

import com.example.ghuraghuri.model.FileResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<FileResponse,Integer> {
}
