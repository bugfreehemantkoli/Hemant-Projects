//Java program to implement binary search

import java.util.Scanner;
import java.util.Arrays;

class JAVA_32__Binary_Search{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Element (" + (i + 1) + ") : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("\nArray Before Sorting : ");
        printArray(arr);

        Arrays.sort(arr);

        System.out.print("\nArray After Sorting  : ");
        printArray(arr);

        System.out.print("\nEnter the value to find : ");
        int value = sc.nextInt();

        int result = binarySearch(arr, value);

        if (result == -1) {
            System.out.println("Not Found Element!");
        } else {
            System.out.println("'" + value + "' Value Found at Position " + (result + 1));
        }

        sc.close();
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; 

            if (arr[mid] == target) {
                return mid;
            }else if (arr[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}