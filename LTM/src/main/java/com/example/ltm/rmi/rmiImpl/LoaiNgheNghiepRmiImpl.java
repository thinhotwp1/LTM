package com.example.ltm.rmi.rmiImpl;

import com.example.ltm.model.LoaiNgheNghiep;
import com.example.ltm.model.LoaiNgheNghiepData;
import com.example.ltm.repository.LoaiNgheNghiepRepository;
import com.example.ltm.rmi.LoaiNgheNghiepRmi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

@Service
public class LoaiNgheNghiepRmiImpl extends UnicastRemoteObject implements LoaiNgheNghiepRmi {


    private LoaiNgheNghiepRepository loaiNgheNghiepRepository;

    @Autowired
    public LoaiNgheNghiepRmiImpl(LoaiNgheNghiepRepository loaiNgheNghiepRepository) throws RemoteException {
        super();
        this.loaiNgheNghiepRepository = loaiNgheNghiepRepository;
    }

    @Override
    public List<LoaiNgheNghiep> getAll() throws RemoteException {
        LoaiNgheNghiepData loaiNgheNghiepData = new LoaiNgheNghiepData();
        return loaiNgheNghiepRepository.findAll();
    }
//    @Override
//    public String getAll() throws RemoteException {
//        return "OK";
//    }

    @Override
    public void deleteById(Long id) throws RemoteException {

    }

    @Override
    public List<LoaiNgheNghiep> saveAll(List<LoaiNgheNghiep> list) throws RemoteException {
        return null;
    }

    @Override
    public void updateById(LoaiNgheNghiep loaiNgheNghiep) throws RemoteException {

    }
}
