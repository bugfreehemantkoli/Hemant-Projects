import java.util.Scanner;

class SimpleCalculatorWithSwitch{
public static void main(String args[]){

int a,b,ch;

Scanner sc = new Scanner(System.in);

System.out.print("\nEnter the Fisrt Number: ");
a = sc.nextInt();

System.out.print("Enter the Second Number: ");
b = sc.nextInt();

System.out.print("\nEnter your Choice 1->Addition, 2->Subtratic, 3->Multiply, 4->Divide : ");
ch = sc.nextInt();

switch(ch){

case 1:
System.out.println("\nAddition of "+a+"+"+b+": "+(a+b));
break;

case 2:
System.out.println("\nSubtraction of "+a+"-"+b+": "+(a-b));
break;

case 3:
System.out.println("\nMultiply of "+a+"*"+b+": "+(a*b));
break;

case 4:
System.out.println("\nDivide of "+a+"/"+b+": "+(a/b));
break;

default:
System.out.println("\nInvalid Choice");
break;
}
}
}







