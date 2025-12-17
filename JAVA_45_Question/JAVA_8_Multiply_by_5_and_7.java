import java.util.Scanner;

class JAVA_8_Multiply_by_5_and_7{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Check whether the given integer is a multiple of both 5 and 7 : ");
int n = Integer.parseInt(sc.nextLine());

if(n % 5 == 0 && n % 7 == 0){
System.out.print(n+" is Multipy by Both.");
}else{
System.out.print(n+" is not Multipy by Both.");
}
}
}