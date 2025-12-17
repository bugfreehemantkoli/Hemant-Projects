import java.util.Scanner;

class JAVA_17_Root_Quadratic_Equation {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Java program to find the roots of a quadratic equation:-");

        System.out.print("Enter the First Coefficient (a): ");
        double a = Double.parseDouble(sc.nextLine());

        System.out.print("Enter the Second Coefficient (b): ");
        double b = Double.parseDouble(sc.nextLine());

        System.out.print("Enter the Third Coefficient (c): ");
        double c = Double.parseDouble(sc.nextLine());

        if (a != 0.0) {

            double d = (b * b) - (4 * a * c);

            if (d == 0.0) {
                System.out.println("The roots are real and equal.");
                double r = -b / (2 * a);
                System.out.println("Root 1 = " + r);
                System.out.println("Root 2 = " + r);

            } else if (d > 0.0) {
                System.out.println("The roots are real and distinct.");
                double r1 = (-b + Math.sqrt(d)) / (2 * a);
                double r2 = (-b - Math.sqrt(d)) / (2 * a);

                System.out.println("Root 1 = " + r1);
                System.out.println("Root 2 = " + r2);

            } else {
                System.out.println("The roots are imaginary.");
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-d) / (2 * a);

                System.out.println("Root 1 = " + realPart + " + i" + imaginaryPart);
                System.out.println("Root 2 = " + realPart + " - i" + imaginaryPart);
            }

        } else {
            System.out.println("Not a quadratic equation.");
        }
    }
}
