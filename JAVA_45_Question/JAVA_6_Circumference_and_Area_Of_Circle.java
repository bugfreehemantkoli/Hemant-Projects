import java.util.Scanner;

class JAVA_6_Circumference_and_Area_Of_Circle{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

double pi = 3.14159;

System.out.println("Welcome to find the Circumference and Area of a circle :-");

System.out.print("\nEnter the Radius of Circle : ");
double radius = Float.parseFloat(sc.nextLine());

System.out.println("The Circumference of Circle Value: "+ 2*Math.PI*radius);

System.out.println("The Area of Circle : "+ Math.PI*radius*radius);
	}
}