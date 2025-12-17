import java.util.Scanner;

class JAVA_1_EvenOrOdd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Number to get Odd or Even : ");
	int n = sc.nextInt();
	
	if(n%2==0){
	System.out.println("It's Even Number "+n);
	}else{
	System.out.println("It's Odd Number "+n);
	}
    }
}