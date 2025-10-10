import java.io.*;
class add_Two_No_with_BufferedReader{
public static void main(String args[])throws IOException{

int a,b,c;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.print("Enter First Number:");
a = Integer.parseInt(br.readLine());

System.out.print("\nEnter Second Number:");
b = Integer.parseInt(br.readLine());

c =a+b;

System.out.println("\n Addtion="+c);
}
}