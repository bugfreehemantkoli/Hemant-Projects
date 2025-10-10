import java.util.Scanner;

class Find_X_Power{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

int x,y,pow=1;

System.out.print("\nEnter the Value -> ");
x = sc.nextInt();

System.out.print("Enter the Power -> ");
y = sc.nextInt();

while(y>0){
pow = pow * x;
y--;
}

System.out.print("Value of Power  -> "+pow+"\n");
}
}