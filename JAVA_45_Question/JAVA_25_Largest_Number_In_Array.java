import java.util.Scanner;

class JAVA_25_Largest_Number_In_Array{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Length of Array : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		for(int i=0; i<n; i++){
			System.out.print("Enter the Values : ");
			a[i] = sc.nextInt();
		}
		
		int largest = a[0];
		for(int i=1;i<n; i++){
			if(a[i] > largest){
				largest = a[i];
			}
		}
		System.out.println("In Array Largest No. is "+largest);
	}
}