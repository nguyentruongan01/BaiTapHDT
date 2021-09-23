package com.annt2008110023.lab1;

import java.util.Scanner;

public class Lab1Bai2 {

    public static void main(String[] args) {
        double chuVi,dienTich,canhNhoNhat;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double chieuDai=scanner.nextDouble();
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double chieuRong=scanner.nextDouble();

        chuVi=(chieuDai+chieuRong)*2;
        dienTich=chieuDai*chieuRong;
        canhNhoNhat=Math.min(chieuDai,chieuRong);

        System.out.println("Chu vi hình chữ nhật là: " +chuVi);
        System.out.println("Diện tích hình chữ nhật là: " +dienTich);
        System.out.println("Cạnh nhỏ nhất của hình chữ nhật là: " +canhNhoNhat);
    }
    
}
