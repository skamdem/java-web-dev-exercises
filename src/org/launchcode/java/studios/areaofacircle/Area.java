package org.launchcode.java.studios.areaofacircle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) throws Exception {
        Scanner input;
        System.out.print("Calculating the area of a circle\n Enter the radius: ");
        double radius;
        boolean badValueSubmitted = true;
        do {
            try {
                input = new Scanner(System.in);
                radius = input.nextDouble();
                if (radius < 0) {
                    throw new Exception("Invalid negative value entered");
                }
                System.out.println("The circle's area is :" + Circle.getArea(radius));
                badValueSubmitted = false;
            } catch (InputMismatchException e) {
                //e.printStackTrace();
                System.out.println("The value entered is not a valid number");
                badValueSubmitted = true;
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println(e.getMessage());
                badValueSubmitted = true;
            } finally{
                if (badValueSubmitted){
                    System.out.println("Please try again\n Enter the radius: ");
                }
            }
        } while (badValueSubmitted);
    }
}
