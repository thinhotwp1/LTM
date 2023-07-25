package com.example.ltm.model;

import lombok.Data;
import org.modelmapper.ModelMapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class LoaiNgheNghiepData implements Serializable {
    private List<NgheNghiep> ngheNghieps;
    private String ma;
    private String ten;
    private String moTa;

    public LoaiNgheNghiepData() {
    }

    public LoaiNgheNghiepData(String ma, String ten, String moTa) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
    }
    public List<LoaiNgheNghiepData> converDTO(List<LoaiNgheNghiep> listLoaiNgheNghiep){
        ModelMapper modelMapper = new ModelMapper();
        List<LoaiNgheNghiepData> list = new ArrayList<>();
        for (LoaiNgheNghiep loaiNgheNghiep:listLoaiNgheNghiep){
            LoaiNgheNghiepData loaiNgheNghiepData = modelMapper.map(loaiNgheNghiep,LoaiNgheNghiepData.class);
            list.add(loaiNgheNghiepData);
        }
        return list;
    }
}
