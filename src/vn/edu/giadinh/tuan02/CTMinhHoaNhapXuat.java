package vn.edu.giadinh.tuan02;

import java.text.StringCharacterIterator;
import java.util.Scanner;

public class CTMinhHoaNhapXuat {

    public static void main(String[] args) {
        
        System.out.println("Bến Tre" + "Hello" + "World");
        System.out.println(30 + 20);

        

        float diemKTLapTrinh;

        //biến tham chiếu
        Scanner bienNhapLieu;//điều khiển từ xa

        bienNhapLieu = new Scanner(System.in);

        System.out.print("Nhập vào điểm môn kỹ thuật lập trình: ");
        diemKTLapTrinh = bienNhapLieu.nextFloat();


        System.out.println("Điểm môn kỹ thuật lập trình: " + diemKTLapTrinh);
        //ví dụ khác
        String tenSinhVien = new String("Mr Tý");
    }
    
}
