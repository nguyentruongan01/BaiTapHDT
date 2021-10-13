package com.annt2008110023.lab5;

public class XeTestDrive {
    public static void main(String[] args) {
        Xe xe;
        xe = new Xe();
        xe.inThongTin();
        xe = new Xe(6);
        xe.inThongTin();
        xe = new Xe(1000, 15);
        xe.inThongTin();
    }
}
