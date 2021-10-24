package com.annt2008110023.lab6;

public class Square {
    //attribute
    boolean nhapChuot;
    String amThanh;
    public static int soLanNhapChuot;//biến static; biến class
    //method
    void xoay(){
        System.out.println("Xoay 360 độ theo chiều kim đồng hồ");
    }
    void phatAmThanh(){
        System.out.println("te te");
    }
    // method - function tạo - contructor có nhiều tham số
    Square(boolean n, String s){
        nhapChuot = n;
        amThanh = s;
        soLanNhapChuot++;
    }
}
