package vn.edu.giadinh.tuan04;

import java.util.Scanner;

public class Customer {
    String name;
    String address;
    Scanner in = new Scanner(System.in);
    void getName(){
        System.out.print("Nhập tên khách hàng: ");
        name = in.nextLine();

    }
    void getAddress(){
        address = in.nextLine();
        System.out.print("Nhập địa chỉ khách hàng: ");
    }
    void show(){
        System.out.println("Tên khách hàng: "+name);
        System.out.println("Địa chỉ khách hàng: "+address);
    }
}