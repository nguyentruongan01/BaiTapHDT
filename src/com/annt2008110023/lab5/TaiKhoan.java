package com.annt2008110023.lab5;

public class TaiKhoan {
    //attribute - thuộc tính
    String tenTK;
    int soTK;
    int soDu;
    //methood - function
    //hàm tạo mặc định
    TaiKhoan(){
        tenTK = "Nguyễn Trường An";
        soTK = 1234;
        soDu = 1500;
    }
    //hàm tạo 1 tham số
    TaiKhoan(int a){
        tenTK = "Lê Thị Kim Cương";
        soTK = a;
        soDu = 1500;
    }
    //hàm tạo 2 tham số
    TaiKhoan(int a, int b){
        tenTK = "Nguyễn Văn B";
        soTK = a;
        soDu = b;
    }
    void inThongTin(){
        System.out.println("Tên chủ tài khoản: "+tenTK);
        System.out.println("Số tài khoản: "+soTK);
        System.out.println("Số dư trong tài khoản: "+soDu);
    }
    int guiTien(int gui){
        soDu = soDu + gui;
        return soDu;
    }
    int rutTien(int rut){
        soDu = soDu - rut;
        return soDu;
    }
}