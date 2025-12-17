import java.util.Scanner;

class JAVA_12_Sum_of_Digits{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int sum = 0;

System.out.println("Find the sum of the digits of an integer using a while loop :-");

System.out.print("Enter the Integer Digit : ");
int digit = Integer.parseInt(sc.nextLine());

int i = 0;

while(digit > 0){

sum = sum + (digit % 10);
digit = digit / 10;
}i++;

System.out.println("Sum of the Digits : "+sum);
	}
}