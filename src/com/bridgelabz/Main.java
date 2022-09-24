package com.bridgelabz;

public class Main {
    static byte val1;
    static short val2;
    static int val3;
    static long val4;
    static float val5;
    static double val6;
    static char val7;
    static boolean val8;
    private String a = "11";
    private String b = "111";

    public static void main(String[] args) {
        System.out.println("Welcome To Java Programming Language ");
        System.out.println("Byte :" + val1);
        System.out.println("Short :" + val2);
        System.out.println("Int :" + val3);
        System.out.println("Long :" + val4);
        System.out.println("Float :" + val5);
        System.out.println("Double :" + val6);
        System.out.println("Char :" + val7);
        System.out.println("Boolean :" + val8);

        Main main = new Main();
        main.SetStringsAreEqualOrNot();

        func(20);
    }
    private void SetStringsAreEqualOrNot() {
        if (a == b) {
            System.out.println("Two Strings Are Equal ");
        } else {
            System.out.println("Two Strings Are Not Equal");
        }
    }
    static int x = 10;
    static int y;
    static void func(int z) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
    static {
        System.out.println("Running static initialization block.");
        y = x + 5;
    }
}
