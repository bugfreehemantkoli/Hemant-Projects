//Java program to find your weight on Mars 
import java.util.Scanner;

class JAVA_38_Find_Weight_On_Mars{
	public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("\n-------- Java program to find your weight on Mars --------");
        
        System.out.print("Enter your weight on Earth (in kg or lbs): ");
        float earthWeight = input.nextFloat();
		
        float marsWeight = earthWeight * 0.375f;

        System.out.printf("Your weight on Earth: %.2f%n", earthWeight);
        System.out.printf("Your weight on Mars:  %.2f%n", marsWeight);
        
        System.out.println("---------------------------------------------------------");
		input.close();
	}
}