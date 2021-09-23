package com.annt2008110023.lab2;

import java.util.Scanner;

import static java.lang.Math.sqrt;


public class Lab2Bai2 {
    public static void main(String[] args) {
        
    float x1, x2;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhập hệ số a: ");
    int a = scanner.nextInt();
    System.out.print("Nhập hệ số b: ");
    int b = scanner.nextInt();
    System.out.print("Nhập hệ số c: ");
    int c = scanner.nextInt();

    double delta = Math.pow(b, 2)-4*a*c;
    if(delta<0){
        System.out.println("Phương trình vô nghiệm");
    }
    else if(delta == 0){
        x1 = x2 = (-b/(2*a));
        System.out.println("Phương trình có nghiệm kép x1 = x2 " +x1);
    }
    else{
        x1=(float) ((-b+sqrt(delta))/(2*a));
        x2=(float) ((-b-sqrt(delta))/(2*a));
        System.out.println("Phương trình có 2 nghiệm x1 = " +x1 + ",x2=" +x2);
        }

    }
    
}
