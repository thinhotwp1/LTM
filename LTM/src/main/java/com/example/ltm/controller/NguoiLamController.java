package com.example.ltm.controller;

import com.example.ltm.service.NguoiLamService;
import com.example.ltm.model.NguoiLam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/nguoi-lam")
public class NguoiLamController {

    @Autowired
    NguoiLamService nguoiLamService;

    @GetMapping("/get-all")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(nguoiLamService.finall(), HttpStatus.OK);
    }

    @PostMapping("/find-by-ten-nghe-nghiep")
    public ResponseEntity<?> findByTenNgheNghiep(String ngheNghiep){
        return new ResponseEntity<>(nguoiLamService.findByLoaiNgheNghiepTen(ngheNghiep), HttpStatus.OK);
    }

    @PostMapping("/delete-by-id")
    public void deleteNguoilamById(Long id) {
         nguoiLamService.deleteById(id);
    }

    @PostMapping("/save-all")
    public List<NguoiLam> saveNguoilamById(@RequestBody List<NguoiLam> list) {
        return nguoiLamService.saveAll(list);
    }

    @PostMapping("/update-by-id")
    public void updateNguoilamById(NguoiLam nguoiLam) {
         nguoiLamService.updateById(nguoiLam);
    }

}
