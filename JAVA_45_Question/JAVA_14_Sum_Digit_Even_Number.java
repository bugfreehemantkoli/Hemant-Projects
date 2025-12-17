class JAVA_14_Sum_Digit_Even_Number{
public static void main(String args[]){

int sum = 0;
int count = 0;

System.out.println("Java program to display all integers within the range 100-150 whose sum of digits is an even number:-");

for(int i=100;i<150;i++){
      int num = i;

      while(num!=0){
        
	int digit = num % 10;
        sum = sum + digit;
        
	num = num/10;
      }
      if(sum%2==0){
          System.out.println(i);
		count = count + i;
        }
    }
System.out.println("\nSum of all digits is an even number between rang 100-150 : "+count);
	}
}