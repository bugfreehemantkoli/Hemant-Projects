import java.util.Scanner;

public class JAVA_41_Tax_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Annual Income Tax Calculator ---");
        System.out.print("Enter your total annual income: ");
        double income = input.nextDouble();

        double tax = 0;

        // Progressive Tax Logic
        if (income <= 10000) {
            tax = income * 0.10;
        } 
        else if (income <= 50000) {
            // First 10k at 10%, the rest at 20%
            tax = (10000 * 0.10) + ((income - 10000) * 0.20);
        } 
        else {
            // First 10k at 10%, next 40k at 20%, the rest at 30%
            tax = (10000 * 0.10) + (40000 * 0.20) + ((income - 50000) * 0.30);
        }

        double netSalary = income - tax;

        System.out.println("------------------------------------");
        System.out.println("Total Income:  Rs."+ income);
        System.out.println("Total Tax:     Rs."+ tax);
        System.out.println("Take-home Pay: Rs."+ netSalary);
        System.out.println("------------------------------------");
    }
}