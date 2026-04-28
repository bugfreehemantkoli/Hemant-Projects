//Java program to find the number of containers you need 

import java.util.Scanner;

public class JAVA_40_ContainerCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Shipment Container Calculator ---");

       
        System.out.print("Enter total number of items: ");
        int totalItems = input.nextInt();

        System.out.print("Enter capacity of one container: ");
        int capacity = input.nextInt();

        int containersA = (int) Math.ceil((double) totalItems / capacity);

        int containersB = (totalItems + capacity - 1) / capacity;

        System.out.println("-------------------------------------");
        System.out.println("Total Items: " + totalItems);
        System.out.println("Capacity per Container: " + capacity);
        System.out.println("Containers needed: " + containersA);
        
        int leftover = totalItems % capacity;
        if (leftover > 0) {
            System.out.println("Note: The last container will only have " + leftover + " items.");
        } else {
            System.out.println("Note: All containers will be perfectly full.");
        }
		input.close();
    }
}