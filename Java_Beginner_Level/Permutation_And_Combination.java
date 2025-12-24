import java.util.Scanner;

class Permutation_And_Combination{
	public static int fact(int x){
		int f = 1;
		for(int i = 1; i<=x; i++){
			f *= i;
		}
		return f;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the N Value : ");
		int n = sc.nextInt();
		
		System.out.print("Enter the R Value : ");
		int r = sc.nextInt();
		
		int nPr = fact(n) / fact(n-r);
		int nCr = fact(n) / (fact(r) * fact(n-r));
		System.out.println("Permutation Values = "+nPr);
		System.out.println("Combination Values = "+nCr);
	
	}
}