import java.util.Scanner;

class JAVA_13_Multiply_by_3_btw_10_50{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Displaying all the multiples of 3 within the range 10 to 50 :-");

for(int i = 10; i<=50; i++){
	if(i % 3 == 0){
	System.out.println("Multpli by 3 is : "+i);
			}
		}
	}
}