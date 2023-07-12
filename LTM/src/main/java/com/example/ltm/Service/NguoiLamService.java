package com.example.ltm.Service;

import com.example.ltm.Repository.NguoiLamRepository;
import com.example.ltm.model.NguoiLam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NguoiLamService {

    private final NguoiLamRepository nguoiLamRepository;

    @Autowired
    public NguoiLamService(NguoiLamRepository nguoiLamRepository) {
        this.nguoiLamRepository = nguoiLamRepository;
    }

    public List<NguoiLam> findByLoaiNgheNghiepTen(String ten) {
        return nguoiLamRepository.findByNgheNghiepTen(ten);
    }

    public List<NguoiLam> finall() {
        return nguoiLamRepository.findAll();
    }

    public void deleteById(Long id) {
         nguoiLamRepository.deleteById(id);
    }

    public List<NguoiLam> saveAll(List<NguoiLam> list) {
        return nguoiLamRepository.saveAllAndFlush(list);
    }
}
