import java.util.Scanner;

class FindMaxBTWThreeNumber{

public static void main(String args[]){

long a,b,c;

Scanner sc = new Scanner(System.in);

System.out.print("\nEnter the First No.:");
a = sc.nextLong();

System.out.print("\nEnter the Second No.:");
b = sc.nextLong();

System.out.print("\nEnter the Third No.:");
c = sc.nextLong();

if(a>b && a>c)
{
System.out.println("\nMax Number is:"+a);
}
else if(b>a && b>c){
System.out.println("\nMax Number is:"+b);
}
else{
System.out.println("\nMax Number is:"+c);
}
}
}
