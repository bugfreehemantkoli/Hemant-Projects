import java.util.Scanner;

class JAVA_4_Average_Of_Integers{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

float sum = 0;

System.out.print("Enter the count of numbers : ");
//int count = Integer.parseInt(sc.nextLine());
int count = sc.nextInt();

for(int i = 0; i<count; i++){
	System.out.print("Enter the Value : ");
	//int x = Integer.parseInt(sc.nextLine());
	int x = sc.nextInt();
	sum = sum + x;
	}

System.out.println("The Average of All Value : "+sum/count);

sc.close();

	}
}
