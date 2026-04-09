import java.util.Scanner;

class JAVA_22_Nth_term_in_a_Fibonacci_series{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a=0, b=1, next, n, i;
	
	System.out.print("Enter the Value of Fibonacci Series : ");
	n = sc.nextInt();
	for (i=1; i<n; i++){
            next = a+b;
            a=b;
            b=next;
        }
		System.out.println("Nth_term_in_a_Fibonacci_series : "+a);
    }
}
