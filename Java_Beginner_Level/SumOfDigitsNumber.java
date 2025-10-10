import java.util.Scanner;

class SumOfDigitsNumber{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

int n, sum=0;

System.out.print("Enter the Number : ");
n = sc.nextInt();

while(n>0){
    sum = sum+n%10;
    n=n/10;
}
System.out.println("Value : "+sum);
}
}