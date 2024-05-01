package com.perscholas.pa303103;

public class KidUser implements LibraryUser {

    private int age;
    private String bookType;

    public KidUser() {
        this.age = 0;
        this.bookType = "";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age <= 11) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, age must be less than 12 to register as a kid");
        }

    }

    @Override
    public void requestBook() {
        if (bookType == "Kids") {
            System.out.println("Book issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }
}
