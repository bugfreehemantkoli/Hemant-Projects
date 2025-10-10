import java.util.Scanner;

class Revers{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

long n, rev=0;

System.out.print("Enter Number for Revers : ");
n = sc.nextInt();

while(n>0){
rev=(rev*10)+n%10;
n=n/10;
}

System.out.println("Revers Value : "+rev);
}
}