package com.example.ltm;

import com.example.ltm.model.LoaiNgheNghiep;
import com.example.ltm.repository.LoaiNgheNghiepRepository;
import com.example.ltm.rmi.LoaiNgheNghiepRmi;
import com.example.ltm.rmi.rmiImpl.LoaiNgheNghiepRmiImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

public class RMIClient {
    public static void main(String[] args) {
        try {
            // Kết nối tới RMI Registry
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Lấy đối tượng register.Calculator từ RMI Registry
            LoaiNgheNghiepRmi loaiNgheNghiepRmi = (LoaiNgheNghiepRmi) registry.lookup("loaiNgheNghiepRmi");

            // Gọi phương thức từ xa
//            List<LoaiNgheNghiep> result = loaiNgheNghiepRmi.getAll();
            List<LoaiNgheNghiep> result = loaiNgheNghiepRmi.getAll();
            System.out.println("Result: " + result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}