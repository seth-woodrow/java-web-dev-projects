package org.launchcode;
import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle: ");
        int userLength= Integer.parseInt(input.nextLine());

        System.out.println("What is the width of the rectangle: ");
        int userWidth= Integer.parseInt(input.nextLine());

        System.out.println("Rectangle area is: " + userLength*userWidth);


    }
}
