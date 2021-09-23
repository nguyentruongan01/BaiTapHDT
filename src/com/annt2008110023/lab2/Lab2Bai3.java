package com.annt2008110023.lab2;

import java.util.Scanner;

public class Lab2Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số tiền điện của tháng là: ");
        double soDien = scanner.nextDouble();
        if(soDien>=50){
            System.out.println("Số tiền điện trong tháng là: " + (soDien*1000));
        }
        else{
            System.out.println("Số tiền điện trong tháng là: " +(50*1000+(soDien-50)*122000));
        }
    }
    
}
