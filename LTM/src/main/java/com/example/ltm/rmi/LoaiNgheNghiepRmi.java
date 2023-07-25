package com.example.ltm.rmi;

import com.example.ltm.model.LoaiNgheNghiep;
import org.springframework.stereotype.Repository;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

@Repository
public interface LoaiNgheNghiepRmi extends Remote {
    List<LoaiNgheNghiep> getAll() throws RemoteException;
    void deleteById(Long id) throws RemoteException;
    List<LoaiNgheNghiep> saveAll(List<LoaiNgheNghiep> list) throws RemoteException;
    void updateById(LoaiNgheNghiep loaiNgheNghiep) throws RemoteException;
}