import java.util.Scanner;

class JAVA_9_Average_Of_5_Integer{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Find the average of 5 numbers using a while loop");

System.out.println();

int i=1;
float sum = 0;
while(i<=5){
	System.out.print("Enter the Values : ");
	float value = Float.parseFloat(sc.nextLine());
	sum = sum + value;
}i++;

System.out.println("The Average of 5 Number is : "+sum/2);
	}
}