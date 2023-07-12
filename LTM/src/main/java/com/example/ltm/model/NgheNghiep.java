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

    @ManyToOne
    @JoinColumn(name = "loainghenghiep_id")
    private LoaiNgheNghiep loaiNgheNghiep;
    // Constructors, getters, setters
}