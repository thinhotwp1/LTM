package com.example.ltm.model;

import lombok.Data;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "loainghenghiep")
public class LoaiNgheNghiep  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "loainghenghiep_id")
    private List<NgheNghiep> ngheNghieps;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    @Column(name = "mo_ta")
    private String moTa;

    // Constructors, getters, setters


    public LoaiNgheNghiep() {
    }

    public LoaiNgheNghiep(String ma, String ten, String moTa) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
    }
}