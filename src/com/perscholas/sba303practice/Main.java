package com.perscholas.sba303practice;

public class Main {

    public static void main(String[] args) {
        printDigitsUsingStringClass("597");
        printDigitsUsingCharacterClass("597");
        divideDigits("824");
        substractDigits("824");
    }

    private static void printDigitsUsingStringClass(String s) {
        String[] digits = s.split("");
        for (int i = 0; i < digits.length; i++) {
            System.out.println("Number " + (i + 1) + " is " + digits[i]);
        }
    }

    private static void printDigitsUsingCharacterClass(String str) {
        char[] digits = str.toCharArray();
        for (int i = 0; i < digits.length; i++) {
            System.out.println("Number " + (i + 1) + " is " + digits[i]);
        }
    }

    private static void divideDigits(String str) {
        char[] digits = str.toCharArray();
        int answer = digits[0] - '0';
        for (int i = 1; i < digits.length; i++) {
            answer = answer / (digits[i] - '0');
        }
        System.out.println("String = " + str);
        System.out.println("Answer = " + answer);
    }

    private static void substractDigits(String str) {
        char[] digits = str.toCharArray();
        int answer = digits[0] - '0';
        for (int i = 1; i < digits.length; i++) {
            answer = answer - (digits[i] - '0');
        }
        System.out.println("String = " + str);
        System.out.println("Answer = " + answer);
    }

}
