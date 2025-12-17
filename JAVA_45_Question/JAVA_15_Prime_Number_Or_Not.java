import java.util.Scanner;

class JAVA_15_Prime_Number_Or_Not {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Java program to check whether the given integer is a prime number or not:");
        System.out.print("Enter an integer greater than 1: ");

        int number = sc.nextInt();
        boolean isPrime = true;

        // check divisors up to sqrt(number)
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

        sc.close();
    }
}
