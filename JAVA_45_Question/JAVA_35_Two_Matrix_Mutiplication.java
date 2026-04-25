//Java program to implement matrix multiplication...
import java.util.Scanner;

class JAVA_35_Two_Matrix_Mutiplication{
	public static void main(String args[]){
		try{
			Scanner sc = new Scanner(System.in);
		
			System.out.print("Enter the Array A Size : ");
			int size1 = sc.nextInt();
			System.out.print("Enter the Array B Size : ");
			int size2 = sc.nextInt();
			
			if(size1==size2){
			int[][] A = new int[size1][size1];
			int[][] B = new int[size2][size2];
			int[][] C = new int[size1][size2];
			
			for(int i=0; i<size1; i++){
			for(int j=0; j<size1; j++){
			System.out.print("Enter the Element A["+i+"]["+j+"] : ");
				A[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<size2; i++){
			for(int j=0; j<size2; j++){
				System.out.print("Enter the Element B["+i+"]["+j+"] : ");
				B[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		System.out.println("Matrix A all elements :-");
		for(int i=0; i<size1; i++){
			for(int j=0; j<size1; j++){
			System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Matrix B all elements :-");
		for(int i=0; i<size2; i++){
			for(int j=0; j<size2; j++){
			System.out.print(B[i][j]+" ");
			}
			System.out.println();
			}
		//Mutiplication
		for(int i=0; i<size1; i++){
            for(int j=0; j<size2; j++){
                C[i][j] = 0;
                for(int k=0; k<size2; k++){
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }
		
			System.out.println();
		
			System.out.println("A & B Two Matrix Multiplication :-"); 
		
			for(int i=0; i<size1; i++){
				for(int j=0; j<size2; j++){
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