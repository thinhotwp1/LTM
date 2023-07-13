package com.example.ltm.service;

import com.example.ltm.repository.LoaiNgheNghiepRepository;
import com.example.ltm.model.LoaiNgheNghiep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiNgheNghiepService {

    private final LoaiNgheNghiepRepository LoaiNgheNghiepRepository;

    @Autowired
    public LoaiNgheNghiepService(LoaiNgheNghiepRepository LoaiNgheNghiepRepository) {
        this.LoaiNgheNghiepRepository = LoaiNgheNghiepRepository;
    }


    public List<LoaiNgheNghiep> finall() {
        return LoaiNgheNghiepRepository.findAll();
    }

    public void deleteById(Long id) {
         LoaiNgheNghiepRepository.deleteById(id);
    }

    public List<LoaiNgheNghiep> saveAll(List<LoaiNgheNghiep> list) {
        return LoaiNgheNghiepRepository.saveAllAndFlush(list);
    }
    public void updateById(LoaiNgheNghiep loaiNgheNghiep) {
        deleteById(loaiNgheNghiep.getId());
        LoaiNgheNghiepRepository.save(loaiNgheNghiep);
    }


}
