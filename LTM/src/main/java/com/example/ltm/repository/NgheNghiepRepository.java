package com.example.ltm.repository;

import com.example.ltm.model.NgheNghiep;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NgheNghiepRepository extends JpaRepository<NgheNghiep, Long> {
    @Override
    List<NgheNghiep> findAll();



}