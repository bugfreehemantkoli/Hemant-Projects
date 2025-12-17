import java.util.Scanner;

class PrintNumber{
	void print_till_zero(int n){
		
      if(n==0)
        return;
      System.out.println(n);
      n=n-1;
      print_till_zero(n);
    }
}

class JAVA_18_Recursion_Print_Numbers{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the the Value : ");
	int n = sc.nextInt();
	
	PrintNumber Rec = new PrintNumber();
	Rec.print_till_zero(n); 
  }
}