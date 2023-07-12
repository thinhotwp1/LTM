package com.example.ltm.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "nguoilam")
public class NguoiLam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    @Column(name = "nam_sinh")
    private int namSinh;

    @Column(name = "que_quan")
    private String queQuan;

    @Column(name = "gioi_tinh")
    private String gioiTinh;

    @ManyToOne
    @JoinColumn(name = "nghenghiep_id")
    private NgheNghiep ngheNghiep;

    // Constructors, getters, setters
}