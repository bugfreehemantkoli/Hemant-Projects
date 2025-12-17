import java.util.Scanner;

class JAVA_10_Reverse_Order{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int reverse = 0;
System.out.println("Welcome to Display the given integer in the reverse order:-");

System.out.print("Enter the Value : ");
int value = Integer.parseInt(sc.nextLine());

while(value>0){
	reverse = (reverse * 10) + value % 10;
	value = value / 10;
	}

System.out.println("Integer in the Reverse Order : "+reverse);
	}
}