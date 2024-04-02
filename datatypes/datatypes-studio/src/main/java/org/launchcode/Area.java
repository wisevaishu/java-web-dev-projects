package org.launchcode;

import java.util.Scanner;

import static java.lang.Double.isNaN;


public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius;
        //double areaOfCircle;
        System.out.println("Enter the Radius");

        do
        {
            while(!input.hasNextDouble())
            {
                System.out.println("Please enter a number");
                input.next();
            }
            radius = input.nextDouble();
            if (radius<0)
            {
                System.out.println("The Radius should not be negative");
                System.out.println("Enter the Radius");
            }
        }while(radius<0);

        System.out.println("The area of circle is :" +Circle.getArea(radius));
    }
}
