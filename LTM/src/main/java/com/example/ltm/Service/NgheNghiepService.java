package com.example.ltm.Service;

import com.example.ltm.Repository.NgheNghiepRepository;
import com.example.ltm.model.NgheNghiep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

}
