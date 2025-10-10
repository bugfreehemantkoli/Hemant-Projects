import java.util.Scanner;

class freq {
    int size, key;
    int[] a; // Class-level array

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        size = sc.nextInt();

        a = new int[size]; 

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Value: ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter No. to Search: ");
        key = sc.nextInt();
    }

    void search() {
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (a[i] == key) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Frequency is: " + count);
        } else {
            System.out.println("Number not found in the array.");
        }
    }
}

class frequency {
    public static void main(String args[]) {
        freq aa = new freq();
        aa.getdata(); 
        aa.search();
    }
}
