import java.util.Scanner;

class JAVA_20_Sum_of_Number_using_Array{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How Many Number to Add : ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		int sum = 0;
		
		for(int i = 0; i<size; i++){
			System.out.print("Enter the No. : ");
			a[i] = sc.nextInt();
			
			sum = sum + a[i];
		}
		System.out.print("Sum of All Arrays : "+sum);
	}
}