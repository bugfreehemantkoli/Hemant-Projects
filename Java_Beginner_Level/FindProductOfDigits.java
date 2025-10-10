import java.util.Scanner;

class FindProductOfDigits{

public static void main(String args[]){

int n, product = 1;

Scanner sc = new Scanner(System.in);

System.out.print("Enter the Digits : ");
n = sc.nextInt();

while(n>0){
product = product * (n%10);
n = n / 10;
}
System.out.print("\nValue of Product : "+product);
}
}