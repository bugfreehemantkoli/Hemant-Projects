import java.util.Scanner;

class Table{

public static void main(String args[]){

int n,i,m;

Scanner sc = new Scanner(System.in);

System.out.print("Enter Number for Print Table : ");
n = sc.nextInt();

m=n;

for(i=1;i<=10;i++){
System.out.println(m+" x "+i+" = "+(i*n));
}
}
}