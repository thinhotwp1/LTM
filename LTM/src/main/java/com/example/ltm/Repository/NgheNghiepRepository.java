package com.example.ltm.Repository;

import com.example.ltm.model.NgheNghiep;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NgheNghiepRepository extends JpaRepository<NgheNghiep, Long> {
    @Override
    List<NgheNghiep> findAll();



}