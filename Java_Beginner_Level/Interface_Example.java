import java.util.Scanner;

interface area{
    final static float pi = 3.14F;
    float calculate(float x, float y);
}

class rectangle implements area{
    public float calculate(float x, float y){
        return x*y;
    }
}

class circle implements area{
    public float calculate(float x, float y){
        return pi*x*x;
    }
}

class Interface_Example{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        rectangle rect = new rectangle();
        circle cir = new circle();

        area a;

        System.out.print("Enter the Value 1 : ");
        int x = sc.nextInt();

        System.out.print("Enter the Value 2 : ");
        int y = sc.nextInt();

        a = rect;
        System.out.println("Area of Rectangle = "+ a.calculate(x, y));

        a = cir;
        System.out.println("Area of Circle = "+ a.calculate(x, y));
    }
}