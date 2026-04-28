//Java program to calculate the area of a rectangle 

import java.util.Scanner;

public class JAVA_44_Area_Of_Rectangle {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("\n--- Rectangle Area Calculator ---");

        System.out.print("Enter the length: ");
        double length = Input.nextDouble();

        System.out.print("Enter the width: ");
        double width = Input.nextDouble();

        double area = length * width;

        System.out.println("---------------------------------");
        System.out.printf("The area of the rectangle is: %.2f%n", area);
        System.out.println("---------------------------------");
		Input.close();
    }
}