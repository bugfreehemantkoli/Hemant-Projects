import java.util.Scanner;

class JAVA_26_Insert_Number_at_any_position_in_Array{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Array Size : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		int i;
		for(i=0;i<size;i++){
			System.out.print("Enter Element "+(i+1)+" : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("All Array Elements : ");
		for(i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.print("\nDo you want to insert more element? (0 = Yes / 1 = No) : ");
		int more = sc.nextInt();
		
		if(more == 1) {
            System.out.println("No Insertion. Thank You !");
            return;
        }
		
		if(more != 0) {
            System.out.println("Invalid choice!");
            return;
		}
		
        System.out.print("Enter the Position (1 to " + (size+1) + ") : ");
        int position = sc.nextInt();
		
		if(position <= size+1){
        System.out.print("Enter the New Element : ");
        int val = sc.nextInt();

        int brr[] = new int[size + 1];

        for(i = 0; i < position-1; i++) {
            brr[i] = arr[i];
        }

		brr[position-1] = val;

        for(i = position; i <= size; i++) {
            brr[i] = arr[i-1];
        }

        System.out.println("Array after insertion:");
        for(i = 0; i < size+1; i++) {
            System.out.print(brr[i] + " ");
        }
	}else{
		System.out.println("Invalid Input.");
	}
	sc.close();
	}
}