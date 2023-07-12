package com.example.ltm.Repository;
import com.example.ltm.model.NguoiLam;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NguoiLamRepository extends JpaRepository<NguoiLam, Long> {
    List<NguoiLam> findByNgheNghiepTen(String ten);
}