package com.perscholas.interfaceDemo;

public class Rectangle extends Shape implements Movable {
    private int x, y;   // x and y coordinates of the point

    /** Constructs a MovablePoint instance at the given x and y */
    public Rectangle(int x, int y, double width, double height) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        //double area = PI * this.radius * this.radius;
        double area = this.width * this.height; // initializing value in parent class variable
        return area; //reference to  parent class variable
    }
    @Override
    public void displayshapName() {
        System.out.println("Drawing a Rectangle of width " + this.width + " and height " + this.height);
    }
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Rectangle[ width = " + width + ", height = " + height +
                super.toString() +  "] ";
    }

    public String getCoordinate()
    {
        return  "(" + x + "," + y + ")";
    }

    // Need to implement all the abstract methods defined in the interface Movable
    @Override
    public void moveUp() {
        y++;
    }
    @Override
    public void moveDown() {
        y--;
    }
    @Override
    public void moveLeft() {
        x--;
    }
    @Override
    public void moveRight() {
        x++;
    }
}
