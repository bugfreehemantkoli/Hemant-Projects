//Java program to implement linear search
import java.util.Scanner;

class JAVA_31_Linear_Search{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Array Size : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++){
			System.out.print("Enter the Element ("+(1+i)+") : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Array all Elements : ");
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.print("\nEnter the Value to Find : ");
		int value = sc.nextInt();
		
		boolean found = false;
		for(int i=0; i<n; i++){
			if(arr[i] == value){
				System.out.print("Value Found on Index "+i+" : "+arr[i]);
				found = true;
			}
		}
		if(!found){
			System.out.println("Value Not Found!");
		}
		sc.close();
	}
}
