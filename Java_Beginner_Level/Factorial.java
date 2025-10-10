import java.util.Scanner;

class Factorial{

public static void main(String args[]){

int n,num = 1;

Scanner sc = new Scanner(System.in);

System.out.print("Enter the Number for Factorial Value : ");
n = sc.nextInt();

while(n>0){
num = num * n;
n = n-1;

}
System.out.println("Factorial Value : "+num);
}
}