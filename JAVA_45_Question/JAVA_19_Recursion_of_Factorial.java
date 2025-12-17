import java.util.Scanner;

class Factorial {

    int Fac(int n) {          // return type changed to int
        if (n == 1) {
            return 1;         // base case must return
        } else {
            return n * Fac(n - 1);   // recursive call
        }
    }
}

class JAVA_19_Recursion_of_Factorial {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. for Factorial Value : ");
        int n = sc.nextInt();

        Factorial F = new Factorial();
        System.out.println("Factorial is : " + F.Fac(n));
    }
}
