package org.launchcode;
import java.nio.file.LinkPermission;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius");
        double radius = input.nextDouble();
        boolean isValid = false;

        while(!isValid) {
            if (radius > 0) {
                isValid = true;
            } else {
                System.out.println("Input a valid input.");
                radius = input.nextDouble();
            }
        }
        System.out.println("The area of a circle of a " + radius + " is " + Circle.getArea(radius));
        input.close();
    }

}
