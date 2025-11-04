import java.util.Scanner;

class Account{
    public int balance;
    
    Account(int AddAmount){
        balance = AddAmount;
    }
    
    boolean isSufficientBal(int withdrawBalance){
        if(balance >= withdrawBalance)
            return true;
        else
            return false;
    }
    
    void withdraw(int userAmount, String name){
        balance = balance - userAmount;
        System.out.println(name+" Transaction Successful.");
        System.out.println("Total Current Balance is "+ balance + "rs.\n");
    }
}

class Customer implements Runnable{
    String name;
    Account x1;

    Customer(Account j1, String username){
        x1 = j1;
        name = username;
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        
        synchronized(x1){
            
            System.out.print("Enter the amount to withdraw for "+name+" : ");
            int amount = sc.nextInt();
            
            if(x1.isSufficientBal(amount)){
                x1.withdraw(amount, name);
            }
            else{
                System.out.println(name+" Insufficient Balance. Transaction Failed.");
                System.out.println("Current Balance is "+ x1.balance + "rs.\n");
            }
        }
    }
}

class synchronizationExample2{
    public static void main(String args[]){
        Account a1 = new Account(5000);
        Customer c1 = new Customer(a1, "Amit");
        Customer c2 = new Customer(a1, "Sumit");
        Customer c3 = new Customer(a1, "Hemant");


        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);

        t1.start();
        t2.start();
        t3.start();
    }
}   