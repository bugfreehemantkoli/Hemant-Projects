import java.util.Scanner;

class JAVA_2_Temprature{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	`System.out.print("Enter the Centigrade Value : ");
	float n = sc.nextFloat();
	
	System.out.println();
	
	float f = (25 * 9/5) + 32;
	
	System.out.println("Value of Farenheit : "+f+"F");
	}
}