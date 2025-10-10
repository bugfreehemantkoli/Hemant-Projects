import java.util.Scanner;

class AllPrimeNoBTW1To100{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

int i,count,j,n,total=0;

System.out.print("Printing All Number : ");
n = sc.nextInt();

for(i=1;i<=n;i++){
count = 0;
for(j=1;j<=i;j++){
if(i%j==0){
count++;
}
}
if(count == 2){
System.out.println(i);
total = total + 1;
}
}
System.out.println("Total Prime no. : "+total);
}
}