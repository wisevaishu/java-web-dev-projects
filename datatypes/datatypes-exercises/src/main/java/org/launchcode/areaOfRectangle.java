package org.launchcode;

import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length;
        double width;
        System.out.println("Length of the Rectangle");
        length=input.nextDouble();
        System.out.println("Width of the Rectangle");
        width=input.nextDouble();
        System.out.println("Area of the Rectangle " + length*width);
    }
}
