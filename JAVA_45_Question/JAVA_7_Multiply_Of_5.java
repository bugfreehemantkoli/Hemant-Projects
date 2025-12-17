import java.util.Scanner;

class JAVA_7_Multiply_Of_5{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter the value : ");
int n = Integer.parseInt(sc.nextLine());

if(n % 5 == 0){
	System.out.print(n+" is Multiple by 5.");
}else{
	System.out.print(n+" is not Multiple by 5.");
}
	}
}