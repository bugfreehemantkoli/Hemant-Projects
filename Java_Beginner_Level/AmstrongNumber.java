import java.util.Scanner;

class AmstrongNumber{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

long n, sum=0,digits,pro,a,count=0,i;

System.out.print("\nEnter the Number : ");
n = sc.nextInt();
a = n;

while(a>0){
count = count + 1;
a = a / 10;
}

a=n;

while(a>0){
digits = a % 10;

pro=1;
for(i=1;i<=count;i++){
pro = pro * digits;
}

sum = sum + pro;
a = a / 10;
}

if(sum == n){
System.out.println("\nIt's Amstrong Number: "+sum);
}else{
System.out.println("\nIt's not Amstrong Number: "+sum);
}

}
}
