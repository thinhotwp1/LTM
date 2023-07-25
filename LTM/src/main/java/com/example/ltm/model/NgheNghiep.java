package com.example.ltm.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "nghenghiep")
public class NgheNghiep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "loainghenghiep_id")
    private long loainghenghiep_id;
    // Constructors, getters, setters


    public NgheNghiep(String ma, String ten, String moTa, long loainghenghiep_id) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
        this.loainghenghiep_id = loainghenghiep_id;
    }
}