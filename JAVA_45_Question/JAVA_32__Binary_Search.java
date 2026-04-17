//Java program to implement binary search
//comment

import java.util.Scanner;
import java.util.Arrays;

class JAVA_32__Binary_Search{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Array Size : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++){
			System.out.print("Enter the Element ("+(i+1)+") : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("\nArray Befor All Elements : ");
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
		
		Arrays.sort(arr);
		
		System.out.print("\nArray After All Elements : ");
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.print("Enter the value to find : ");
		int value = sc.nextINt();
		
		sc.close();
	}
}