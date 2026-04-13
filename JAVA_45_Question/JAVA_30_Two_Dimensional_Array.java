//Two-dimensional array in Java 

import java.util.Scanner;

class JAVA_30_Two_Dimensional_Array{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        
        System.out.print("Enter number of columns : ");
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        
        System.out.println("\nEnter the elements of the matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "] : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nMatrix All Elements :-");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(" "+matrix[i][j] +" ");
            }
            System.out.println();
        }
        sc.close();
	}
}