import java.util.Scanner;

class JAVA_23_Array_Sum_of_Numbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Error: Please enter a positive number!");
            return;
        }

        int[] a = new int[n];
        int sum = 0;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            a[i] = sc.nextInt();
            sum += a[i];
		}
		
        System.out.println("Sum of all elements = " + sum);
        sc.close();		
	}
}