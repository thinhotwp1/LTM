package com.example.ltm.repository;

import com.example.ltm.model.LoaiNgheNghiep;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoaiNgheNghiepRepository extends JpaRepository<LoaiNgheNghiep, Long> {

    @Override
    List<LoaiNgheNghiep> findAll();

}