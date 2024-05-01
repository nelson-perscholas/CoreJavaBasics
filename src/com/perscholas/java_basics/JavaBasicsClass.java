package com.perscholas.java_basics;

import java.sql.SQLOutput;

public class JavaBasicsClass {
    public static void main(String[] args) {

        task1(2);
        task1(9);
        task1(17);
        task1(88);

        task2(150);
        task2(225);
        task2(1555);
        task2(32456);

        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1(int value) {
        int x = value;
        System.out.println("Number x = " + value + " is " + Integer.toBinaryString(x) + " in binary format");

        x <<= 1;
        //now x should be 100 in binary, then 4 in decimal
        System.out.println(" x << 1  = " + x + " in decimal");
        System.out.println("         = " + Integer.toBinaryString(x) + " in binary" );
    }

    public static void task2(int value) {
        int x = value;
        System.out.println("Number x = " + value + " is " + Integer.toBinaryString(x) + " in binary format");

        x >>= 2;
        //now x should be 100 in binary, then 4 in decimal
        System.out.println(" x >> 2  = " + x + " in decimal");
        System.out.println("         = " + Integer.toBinaryString(x) + " in binary" );
    }

    public static void task3() {
        int x = 7;   // 0111
        int y = 17;  // 10001
        int z = x & y;
        // z should be 0000001 = 1
        System.out.println("x=7 in binary format is " + Integer.toBinaryString(x));
        System.out.println("y=17 in binary format is " + Integer.toBinaryString(y));
        System.out.println("z=x&y in decimal is " + z + " in binary format is " + Integer.toBinaryString(z));

    }

    public static void task4() {
        int x = 7; // 0111
        int y = 17; // 10001
        int z = x | y;
        // z should be 10111 = 23
        System.out.println("x=7 in binary format is " + Integer.toBinaryString(x));
        System.out.println("y=17 in binary format is " + Integer.toBinaryString(y));
        System.out.println("z=x|y in decimal is " + z + " in binary format is " + Integer.toBinaryString(z));

    }

    public static void task5() {
        int x = 7;
        System.out.println("x = " + x);
        x++;
        System.out.println("x++ = " + x);
    }

    public static void task6() {
        int a = 5;
        System.out.println("a = " + a);
        a++;
        System.out.println("a++ = " + a);
        a = a + 1;
        System.out.println("a = a + 1 = " + a);
        a += 1;
        System.out.println("a += 1 = " + a);
    }

    public static void task7() {
        int x = 5;
        int y = 8;
        int sum = ++x + y;
        System.out.println("x=5, y=8, sum = ++x + y = " + sum);
        x = 5;
        sum = x++ + y;
        System.out.println("x=5, y=8, sum = x++ + y = " + sum);
    }
}
