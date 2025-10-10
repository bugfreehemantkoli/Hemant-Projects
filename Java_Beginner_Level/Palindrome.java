import java.util.Scanner;

class Palindrome{

public static void main(String args[]){

int n, num,rev=0;

System.out.print("Enter the Value for Find Palindrome No. : ");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();

num = n;

while(n>0){
rev =(rev*10)+n%10;
n = n/10;
}

if(num == rev){
System.out.println("This Value is Palindrome No. : "+num);
}else{
System.out.println("This Value is Not Palindrome No. : "+num);
}
}
}