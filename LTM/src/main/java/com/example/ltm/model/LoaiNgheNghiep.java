package com.example.ltm.model;

import lombok.Data;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "loainghenghiep")
public class LoaiNgheNghiep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    @Column(name = "mo_ta")
    private String moTa;

    // Constructors, getters, setters
}