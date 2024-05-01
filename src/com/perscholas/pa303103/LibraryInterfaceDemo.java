package com.perscholas.pa303103;

public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        KidUser kidUser = new KidUser();
        kidUser.setAge(10);
        kidUser.registerAccount();

        kidUser.setAge(18);
        kidUser.registerAccount();

        kidUser.setBookType("Kids");
        kidUser.requestBook();

        kidUser.setBookType("Fiction");
        kidUser.requestBook();

        AdultUser adultUser = new AdultUser();
        adultUser.setAge(5);
        adultUser.registerAccount();

        adultUser.setAge(23);
        adultUser.registerAccount();

        adultUser.setBookType("Kids");
        adultUser.requestBook();

        adultUser.setBookType("Fiction");
        adultUser.requestBook();

    }
}
