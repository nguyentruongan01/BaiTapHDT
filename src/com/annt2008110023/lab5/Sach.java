package com.annt2008110023.lab5;

public class Sach {
    //attribute - thuộc tính
    String nhaXuatBan;
    double namXuatBan;
    double giaBan;
    String loai;
    //methood - function
    //hàm tạo mặc định
    Sach(){
        loai = "Sách Giáo Dục Công Dân";
        nhaXuatBan = "Nguyễn Văn A";
        namXuatBan = 2001;
        giaBan = 35000;
    }
    //hàm tạo 1 tham số
    Sach(double a){
        loai = "Sách Chính Trị";
        nhaXuatBan = "Nguyễn Văn B";
        namXuatBan = 1997;
        giaBan = a;
    }
    //hàm tạo 2 tham số
    Sach(double m, double n){
        loai = "Sách Khoa Học";
        nhaXuatBan = "Nguyễn Văn C";
        namXuatBan = m;
        giaBan = n;
    }
    void gioiThieuSach(){
        System.out.println("Loại Sách: "+loai);
        System.out.println("Nhà xuất bản: "+nhaXuatBan);
        System.out.println("Năm xuất bản: "+namXuatBan);
        System.out.println("Giá bán: "+giaBan);
    }
    double thanhTien(int soLuong){
        double tien;
        tien = soLuong*giaBan;
        return tien;
    }
}
