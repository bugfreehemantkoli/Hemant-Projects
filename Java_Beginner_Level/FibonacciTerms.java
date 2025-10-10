import java.util.Scanner;

class FibonacciTerms {

    public static void main(String[] args) {
        
	Scanner sc = new Scanner(System.in);
	
	int a = 0, b = 1, next, n, i;
        
	System.out.print("Enter how many Fibonacci numbers to print: ");
        n = sc.nextInt();

	for (i = 1; i <= n; i++) {
            System.out.println(a);
            next = a + b;
            a = b;
            b = next;
        }
     
    }

}
