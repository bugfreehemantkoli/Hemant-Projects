import java.util.Scanner;

class JAVA_24_Find_Odd_Number_In_Array{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Length of Array : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		for(int i=0; i<n;i++){
			System.out.print("Enter the Values "+(i+1)+": ");
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<n;i++){
			if(a[i]%2 != 0){ 
			System.out.println("Odd Numbers in Array : "+ a[i]);
			}
		}
	}
}