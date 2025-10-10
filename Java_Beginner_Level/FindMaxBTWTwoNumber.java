import java.util.Scanner;

class FindMaxBTWTwoNumber{

public static void main(String args[]){

int a,b;

Scanner sc = new Scanner(System.in);

System.out.print("\nEnter the First No.:");
a = sc.nextInt();

System.out.print("\nEnter the Second No.:");
b = sc.nextInt();

if(b<a){
System.out.println("\nMax Number is:"+a);
}else{
System.out.println("\nMax Number is:"+b);
}
}
}
