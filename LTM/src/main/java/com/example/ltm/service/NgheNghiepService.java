package com.example.ltm.service;

import com.example.ltm.repository.NgheNghiepRepository;
import com.example.ltm.model.NgheNghiep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NgheNghiepService {

    private final NgheNghiepRepository ngheNghiepRepository;

    @Autowired
    public NgheNghiepService(NgheNghiepRepository NgheNghiepRepository) {
        this.ngheNghiepRepository = NgheNghiepRepository;
    }


    public List<NgheNghiep> finall() {
        return ngheNghiepRepository.findAll();
    }

    public void deleteById(Long id) {
        ngheNghiepRepository.deleteById(id);
    }

    public List<NgheNghiep> saveAll(List<NgheNghiep> list) {
        return ngheNghiepRepository.saveAllAndFlush(list);
    }

    public void updateById(NgheNghiep ngheNghiep) {
        deleteById(ngheNghiep.getId());
        ngheNghiepRepository.save(ngheNghiep);
    }
}
