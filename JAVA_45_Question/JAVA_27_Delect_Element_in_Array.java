//Java program to delete an element from an array by index 
import java.util.Scanner;

class JAVA_27_Delect_Element_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("\nOriginal Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.print("\n\nEnter the index to delete (0 to " + (n-1) + "): ");
        int index = sc.nextInt();

        if (index < 0 || index >= n) {
            System.out.println("Error: Invalid index!");
            sc.close();
            return;
        }

        int[] Brr = new int[n - 1];

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i != index) {
                Brr[j] = arr[i];
                j++;
            }
        }

        System.out.print("Array after deleting element at index " + index + ": ");
        for (int num : Brr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}