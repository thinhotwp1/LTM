package com.example.ltm;

import com.example.ltm.repository.LoaiNgheNghiepRepository;
import com.example.ltm.rmi.Calculator;
import com.example.ltm.rmi.LoaiNgheNghiepRmi;
import com.example.ltm.rmi.rmiImpl.CalculatorImpl;
import com.example.ltm.rmi.rmiImpl.LoaiNgheNghiepRmiImpl;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
@SpringBootApplication
public class LtmApplication {

    @Autowired
    private LoaiNgheNghiepRepository loaiNgheNghiepRepository;
    public static void main(String[] args) {
        SpringApplication.run(LtmApplication.class, args);
    }
    @PostConstruct
    public void initRmiServer() {
        try {
            // Tạo một đối tượng register.CalculatorImpl
            LoaiNgheNghiepRmi loaiNgheNghiepRmi = new LoaiNgheNghiepRmiImpl(loaiNgheNghiepRepository);

            // Đăng ký đối tượng loaiNgheNghiepRmi với RMI Registry
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("loaiNgheNghiepRmi", loaiNgheNghiepRmi);

            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Bean
    public LoaiNgheNghiepRmi loaiNgheNghiepRmi() throws RemoteException {
        return new LoaiNgheNghiepRmiImpl(loaiNgheNghiepRepository);
    }


}



