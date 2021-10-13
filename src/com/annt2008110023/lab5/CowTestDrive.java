package com.annt2008110023.lab5;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow;
        cow = new Cow();
        cow.inThongTin();
        cow.moo();
        cow = new Cow(8);
        cow.inThongTin();
        cow.moo();
        cow = new Cow(9, 1);
        cow.inThongTin();
        cow.moo();
    }

}
