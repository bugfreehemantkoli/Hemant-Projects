//Java program to find the largest and smallest numbers from an array of random numbers

import java.util.Scanner;

class JAVA_29_Largest_And_Smallest_Number_In_Array{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Size : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			System.out.print("Enter the Element ("+(i+1)+") : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("\nAll Arrays Elements : ");
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
		
		int largest = arr[0];
		int small = arr[0];
		for(int i=0; i<n; i++){	
			if(largest < arr[i]){
				largest = arr[i];
			}
			if(small > arr[i]){
				small = arr[i];
			}
		}
		
		System.out.println("\nLargest Number in Array : "+largest);
		System.out.println("Smallest Number in Array : "+small);
		
	sc.close();	
	}
}