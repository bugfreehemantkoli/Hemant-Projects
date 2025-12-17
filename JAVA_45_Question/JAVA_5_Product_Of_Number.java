import java.util.Scanner;
class JAVA_5_Product_Of_Number{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

float product = 1.0f;
float pro=0;

System.out.print("Enter the count of numbers : ");
int count = Integer.parseInt(sc.nextLine());

for(int i = 0; i<count; i++){
	System.out.print("Enter the Values : ");
	pro = Float.parseFloat(sc.nextLine());
	product = product * pro;
		}

System.out.println("The Product of the numbers : "+product);

	}
}