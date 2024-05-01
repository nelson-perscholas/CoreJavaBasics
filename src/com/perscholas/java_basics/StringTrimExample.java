package com.perscholas.java_basics;

public class StringTrimExample{
    public static void main(String args[]){
        String s1="  hello   ";
        System.out.println(s1+"how are you");        // without trim()
        System.out.println(s1.trim()+" how are you"); // with trim()
    }
}


