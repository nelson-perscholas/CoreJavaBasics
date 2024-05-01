package com.perscholas.java_basics;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
    }

    public static void task1() {
        System.out.println("TASK 1: ");
        int[] arr ={1, 2, 3};
        System.out.println(Arrays.toString(arr));
    }

    public static void task2() {
        System.out.println("TASK 2: ");
        int[] arr = {13, 5, 7, 68, 2};
        System.out.println(arr[arr.length/2]);
    }

    public static void task3() {
        System.out.println("TASK 3: ");
        String[] arr = {"red", "green", "blue", "yellow"};
        System.out.println("Array length = " + arr.length);
        String[] newArr = arr.clone();
        System.out.println("New array = " + Arrays.toString(newArr));
    }

    public static void task4() {
        System.out.println("TASK 4: ");
        int[] arr = {13, 5, 7, 68, 2};
        System.out.println("arr= " + Arrays.toString(arr));
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[arr.length - 1] = " + arr[arr.length - 1]);
        try {
            System.out.println(arr[arr.length]);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            arr[arr.length] = 1;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void task5() {
        System.out.println("TASK 5: ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println("arr= " + Arrays.toString(arr));
    }

    public static void task6() {
        System.out.println("TASK 6: ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * i;
        }
        System.out.println("arr= " + Arrays.toString(arr));
    }

    public static void task7() {
        System.out.println("TASK 7: ");
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("arr= " + Arrays.toString(arr));
        int middle = arr.length/2;
        for(int i = 0; i < arr.length; i++) {
            if (i != middle) {
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        }
    }

    public static void task8() {
        System.out.println("TASK 8: ");
        String[] arr = {"red", "green", "blue", "yellow", "white"};
        System.out.println("before swapping first and middle element = " + Arrays.toString(arr));
        String temp = arr[0];
        arr[0] = arr[arr.length/2];
        arr[arr.length/2] = temp;
        System.out.println("after swapping first and middle element = " + Arrays.toString(arr));
    }

    public static void task9() {
        System.out.println("TASK 9: ");
        int[] arr = {4, 2, 9, 13, 1, 0};
        System.out.println("arr= " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array in ascending order:" + Arrays.toString(arr));
        System.out.println("The smallest number is " + arr[0]);
        System.out.println("The biggest number is " + arr[arr.length - 1]);
    }

    public static void task10() {
        System.out.println("TASK 10: ");
        Object[] arr = {"one", 2, "three", 4.0, "five"};
        System.out.println("arr= " + Arrays.toString(arr));
    }

    public static void task11() {
        System.out.println("TASK 11: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("How many favorite things do you have? ");
        int numFavorites = sc.nextInt();
        String[] favoritesThings = new String[numFavorites];
        sc.nextLine();
        for (int i = 0; i < numFavorites; i++) {
            System.out.print("Enter your thing: ");
            favoritesThings[i] = sc.nextLine();
        }
        System.out.println("Your favorite things are:");
        for (int i = 0; i < numFavorites; i++) {
            System.out.printf(favoritesThings[i] + " ");
        }
    }
}
