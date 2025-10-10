import java.util.Scanner;
class Rectangle_Area_Parimeter{
public static void main(String args[]){
int len,br,area,peri;

Scanner sc = new Scanner(System.in);

System.out.print("Enter Length:");
len = sc.nextInt();

System.out.print("\nEnter Breadth:");
br = sc.nextInt();

area = len*br;

peri = 2*(len+br);

System.out.println("Area of Rectangle= "+area);
System.out.println("Perimeter of Rectangle= "+peri);
}
}