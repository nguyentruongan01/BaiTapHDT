package com.annt2008110023.lab5;

public class Cow {
    //attribute - thuộc tính
    double weight;
    double age;
    //methood - function
    //hàm tạo mặc định
    Cow(){
        weight = 10;
        age = 1;
    }
    //hàm tạo 1 tham số
    Cow(double w){
        weight = w;
        age = 2;
    }
    //hàm tạo 2 tham số
    Cow(double w, double a){
        weight = w;
        age = a;
    }
    void inThongTin(){
        System.out.print("Cân nặng: "+weight);
        System.out.println(" kg");
        System.out.print("Tuổi: "+age);
        System.out.println(" tuổi");
    }
    void moo(){
        System.out.println("Be be be");
    }
}
