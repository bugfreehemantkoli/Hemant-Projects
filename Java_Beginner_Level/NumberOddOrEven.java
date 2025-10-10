import java.util.Scanner;

class NumberOddOrEven{

public static void main(String args[]){

long a;

Scanner sc = new Scanner(System.in);

System.out.print("Enter the Number for Odd or Even:");
a = sc.nextLong();

if(a%2==0){
System.out.println("EVEN Number : " +a);
}
else{
System.out.println("Odd Number : "+a);
}
}
}