//Java program to implement a calculator to do basic operations

import java.util.Scanner;

class JAVA_37_Calculator_Basic_Operation{
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);

        System.out.println("\n-------------- Java Console Calculator Start --------------");
        
        System.out.print("\nEnter first number: ");
        double first = reader.nextDouble();
		
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);
		
		if(operator == '+' || operator == '-' || operator == '*' || operator == '/'){
			System.out.print("Enter second number: ");
        double second = reader.nextDouble();

        double result;
		
        switch (operator) {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                return ;
        }
        System.out.printf("%.2f %c %.2f = %.2f", first, operator, second, result);
		}else{
			System.out.printf("Error! Operator is not correct");
		}
		
		System.out.println("\n\n-------------- Java Console Calculator End --------------"); 
	}
}