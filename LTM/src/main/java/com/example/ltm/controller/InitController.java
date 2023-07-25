package com.example.ltm.controller;

import com.example.ltm.model.LoaiNgheNghiep;
import com.example.ltm.model.NgheNghiep;
import com.example.ltm.repository.LoaiNgheNghiepRepository;
import com.example.ltm.repository.NgheNghiepRepository;
import com.example.ltm.repository.NguoiLamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {

    @Autowired
    LoaiNgheNghiepRepository loaiNgheNghiepRepository;
    @Autowired
    NgheNghiepRepository ngheNghiepRepository;
    @Autowired
    NguoiLamRepository nguoiLamRepository;

    @GetMapping("/init")
    public boolean initData(){
        LoaiNgheNghiep loaiNgheNghiep = new LoaiNgheNghiep("IT", "Công nghệ thông tin", "Vua mọi nghề");
        LoaiNgheNghiep loaiNgheNghiep1 = new LoaiNgheNghiep("Banking", "Ngân hàng", "Nhiều tiền nhiều drama");
        loaiNgheNghiepRepository.save(loaiNgheNghiep1);
        loaiNgheNghiepRepository.save(loaiNgheNghiep);
        NgheNghiep ngheNghiep = new NgheNghiep("CSKH","Chăm sóc khách hàng","Chăm sóc ở banking sướng lắm ",1);
        NgheNghiep ngheNghiep1 = new NgheNghiep("LT","Lập trình viên","Code dạo",2);
        NgheNghiep ngheNghiep2 = new NgheNghiep("LT","Nhúng IOT","Đây mới là vua mọi nghề ",2);
        ngheNghiepRepository.save(ngheNghiep);
        ngheNghiepRepository.save(ngheNghiep1);
        ngheNghiepRepository.save(ngheNghiep2);

        return true;
    }
}
