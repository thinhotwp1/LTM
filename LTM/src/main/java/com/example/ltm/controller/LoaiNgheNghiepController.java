package com.example.ltm.controller;

import com.example.ltm.Service.LoaiNgheNghiepService;
import com.example.ltm.model.LoaiNgheNghiep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loainghenghiep")
public class LoaiNgheNghiepController {


    @Autowired
    LoaiNgheNghiepService loaiNgheNghiepService;

    @GetMapping("/get-all")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(loaiNgheNghiepService.finall(), HttpStatus.OK);
    }


    @PostMapping("/delete-by-id")
    public void deleteloaiNgheNghiepById(Long id) {
         loaiNgheNghiepService.deleteById(id);
    }

    @PostMapping("/save-all")
    public List<LoaiNgheNghiep> deleteloaiNgheNghiepById(@RequestBody List<LoaiNgheNghiep> list) {
        return loaiNgheNghiepService.saveAll(list);
    }
}
