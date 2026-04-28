//Java program to check whether the generated random number is even or odd
import java.util.Scanner;

class JAVA_39_Generated_Random_Number_Even_Or_Odd{
	public static void main(String args[]){
			
		int value = (int)(Math.random()*100);
		
		if(value % 2 == 0){
			System.out.println(value + " is an EVEN number.");
		}else{
			System.out.println(value + " is an ODD number.");
		}
    }
}