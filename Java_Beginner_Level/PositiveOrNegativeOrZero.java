import java.util.Scanner;

class PositiveOrNegativeOrZero{

public static void main(String args[]){

long Num;

Scanner sc = new Scanner(System.in);

System.out.print("Enter the Number : ");
Num = sc.nextLong();

if(0<Num){
System.out.println("Number is Positive : "+Num);
}else if(0>Num){
System.out.println("Number is Negative : "+Num);
}else{
System.out.println("Number is Zero : "+Num);
}
}
}