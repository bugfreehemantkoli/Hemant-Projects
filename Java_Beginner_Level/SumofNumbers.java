import java.util.Scanner;

class SumofNumbers{

public static void main(String args[]){

long i,n,sum=1;

Scanner sc = new Scanner(System.in);

System.out.print("Enter the Number for Sum : ");
n = sc.nextInt();
 
i=1;
while(i<=n){
sum = sum * i;
i++;
}
System.out.println("Sum of value : "+sum);
}
}