import java.util.Scanner;

class NumberIsPrimeOrNot{
public static void main(String args[]){

int n, i, count =0;

Scanner sc = new Scanner(System.in);

System.out.print("Enter the Number to check Prime or Not : ");
n = sc.nextInt();

i=1;
while(i<=n){
	if(n%i==0){
		count = count+1;
		}
		i = i + 1;
	}
if(count == 2){
	System.out.println("It's Prime No.");
		}else{
			System.out.println("It is Not Prime No.");
		}
	}
}
