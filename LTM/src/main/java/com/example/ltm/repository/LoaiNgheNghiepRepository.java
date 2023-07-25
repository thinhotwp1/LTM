package com.example.ltm.repository;

import com.example.ltm.model.LoaiNgheNghiep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoaiNgheNghiepRepository extends JpaRepository<LoaiNgheNghiep, Long> {
    @Override
    List<LoaiNgheNghiep> findAll();

}