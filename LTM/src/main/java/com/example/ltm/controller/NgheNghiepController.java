package com.example.ltm.controller;

import com.example.ltm.service.NgheNghiepService;
import com.example.ltm.model.NgheNghiep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nghenghiep")
public class NgheNghiepController {


    @Autowired
    NgheNghiepService ngheNghiepService;
    
    
    @GetMapping("/get-all")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(ngheNghiepService.finall(), HttpStatus.OK);
    }


    @PostMapping("/delete-by-id")
    public void deletengheNghiepById(Long id) {
        ngheNghiepService.deleteById(id);
    }

    @PostMapping("/save-all")
    public List<NgheNghiep> deletengheNghiepById(@RequestBody List<NgheNghiep> list) {
        return ngheNghiepService.saveAll(list);
    }
//    [{
//        "ma":"NN1",
//                "ten":"Software Engineer",
//                "moTa":"King of occuapations",
//                "loaiNgheNghiep":{
//            "id":"1"
//        }
//    }]

    @PostMapping("/update-by-id")
    public void updateNgheNghiepById(NgheNghiep ngheNghiep) {
        ngheNghiepService.updateById(ngheNghiep);
    }

}
