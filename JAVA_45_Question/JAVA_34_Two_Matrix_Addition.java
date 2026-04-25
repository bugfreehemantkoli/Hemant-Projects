//Java program to implement matrix addition
import java.util.Scanner;

class JAVA_34_Two_Matrix_Addition{
	public static void main(String args[]){
		
		try{
			Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array A Size : ");
		int a = sc.nextInt();
		System.out.print("Enter the Array B Size : ");
		int b = sc.nextInt();

		if(a == b){
		int[][] A = new int[a][a];
		int[][] B = new int[b][b];
		int[][] C = new int[a][b];
		
		for(int i=0; i<a; i++){
			for(int j=0; j<a; j++){
			System.out.print("Enter the Element A["+i+"]["+j+"] : ");
				A[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<b; i++){
			for(int j=0; j<b; j++){
				System.out.print("Enter the Element B["+i+"]["+j+"] : ");
				B[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		System.out.println("Matrix A all elements :-");
		for(int i=0; i<a; i++){
			for(int j=0; j<a; j++){
			System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Matrix B all elements :-");
		for(int i=0; i<a; i++){
			for(int j=0; j<a; j++){
			System.out.print(B[i][j]+" ");
			}
			System.out.println();
			}
		
		for(int i=0; i<a; i++){
			for(int j=0; j<b; j++){
			C[i][j] = A[i][j]+B[i][j];			
			}
		}
		
		System.out.println();
		
		System.out.println("A & B Two Matrix Addition:-");
		
		for(int i=0; i<a; i++){
			for(int j=0; j<b; j++){
			System.out.print(C[i][j]+" ");
			}
			System.out.println();
			}
		}else{
			System.out.println("Invalid Input.");
		}	
		}catch(Exception e){
			System.out.println("\nJava Error occurd = "+e);
		}
	}
}