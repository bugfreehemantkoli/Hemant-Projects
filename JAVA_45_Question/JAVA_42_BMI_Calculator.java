//Calculate BMI using Java 
import java.util.Scanner;

public class JAVA_42_BMI_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Body Mass Index (BMI) Calculator ---");
		
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = input.nextDouble();
		
        double bmi = weight / (height * height);
		
        System.out.println("----------------------------------------");
        System.out.printf("Your BMI is: %.2f%n", bmi);
		
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal weight");
        } else if (bmi < 30) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }
        System.out.println("----------------------------------------");
		input.close();
    }
}