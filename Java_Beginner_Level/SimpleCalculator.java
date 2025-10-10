import java.util.Scanner;

class SimpleCalculator{

public static void main(String args[]){

long a,b,ch;

Scanner sc = new Scanner(System.in);

System.out.print("Enter the First No.: ");
a = sc.nextLong();

System.out.print("Enter the Second No.: ");
b = sc.nextLong();

System.out.print("\n\n");

System.out.print("Enter Choice 1->Addition,2->Subtration,3->Multiply,4->Divide: ");
ch = sc.nextLong();

if(ch==1){
System.out.println("Addition of Two Number :"+(a+b));
}
else if(ch==2){
System.out.println("Subtration of Two Number :"+(a-b));
}
else if(ch==3){
System.out.println("Multipy of Two Number :"+(a*b));
}
else if(ch==4){
System.out.println("Addition of Two Number :"+(a/b));
}
else{
System.out.println("Invalid Input");
}
}
}

