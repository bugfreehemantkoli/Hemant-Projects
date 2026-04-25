//Java program to check whether a string is a palindrome or not
import java.util.Scanner;

class JAVA_33_String_Palindrome{
	public static void main(String args[]){
		try{
			Scanner sc = new Scanner(System.in);
		String word = new String();
		int Len,i=0,flag=0;
		
		System.out.print("Enter the Word : ");
		word = sc.nextLine();
		
		Len = word.length()-1;
		
		System.out.println("Word : "+word);
		
		while(i<Len && flag == 0){
			if(word.charAt(i) != word.charAt(Len)){
				flag = 1;
			}
			i++;
			Len--;
		}
		if(flag == 0){
			System.out.println("It's Palindrome Word.");
			}else{
				System.out.println("It's Not Palindrome Word.");
				}
		}catch(Exception e){
			System.out.print(e);
		}
	}
}