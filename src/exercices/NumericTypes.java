package exercices;
import java.util.Scanner;
public class NumericTypes {
    public static void main(String[] args) {
        NumericTypes.areaOfrectangle();
        NumericTypes.milesPerGallon();
    }
    public static void areaOfrectangle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Calculating the area of a rectangle\n Enter the length: ");
        double length = input.nextDouble();
        System.out.println("\nEnter the width: ");
        double width = input.nextDouble();
        System.out.println("\nThe rectangle's area is :" + width*length);
    }

    public static void milesPerGallon(){
        Scanner input = new Scanner(System.in);
        System.out.println("Calculating the number miles-per-gallon\n Enter the number of miles driven : ");
        double milesDriven = input.nextDouble();
        System.out.println("\nAmount of gas consumed (in gallons): ");
        double gasConsumed = input.nextDouble();
        System.out.println("\nThe number of miles-per-gallon is :" + milesDriven/gasConsumed);
    }
}

