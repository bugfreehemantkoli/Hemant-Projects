import java.util.Scanner;
class ExceptionExample2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Amount;

        System.out.println("Welcome to the Bank Transaction Portal");
        System.out.print("Enter Amount to Withdraw: ");
        Amount = sc.nextInt();

        int currentAccountBalance = 10000;
        int withdrawAmount = Amount;

        try{
            if(withdrawAmount > currentAccountBalance){
                throw new ArithmeticException("Insufficient Balance in your account.");
            } else {
                currentAccountBalance = currentAccountBalance - withdrawAmount;
                System.out.println("Transaction Successful. Remaining Balance: " + currentAccountBalance);
            }
        } catch(ArithmeticException e){
            System.out.println("Transaction Failed: " + e.getMessage());
            System.out.println("Current Balance: " + currentAccountBalance);
        }
    }
}