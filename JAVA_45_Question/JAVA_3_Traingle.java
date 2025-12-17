import java.util.Scanner;

class JAVA_3_Traingle{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter the 1st side of Triangle : ");
float a = sc.nextFloat();

System.out.print("Enter the 2st side of Triangle : ");
float b = sc.nextFloat();

System.out.print("Enter the 3st side of Triangle : ");
float c = sc.nextFloat();

float s = (a+b+c)/2;
double Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

System.out.println("The Value of Area of a triangle : "+Area);
	}
}