import java.util.Scanner;

class bubble{
    int a[];
    int size;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Enter the Array Size : ");
        size = sc.nextInt();

        a = new int[size];

        for(i=0; i < size; i++){
            System.out.print("Enter No's. :");
            a[i] = sc.nextInt();
        }
    }

    void sort(){
        int i,j,t;

        for(i=0; i < size; i++){
            for(j=0; j < size-i - 1; j++){
                if(a[j] > a[j+1]){
                    t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
    }

    void putdata(){
        int i;

        for(i=0; i<size; i++){
            System.out.println(a[i]);
        }
    }
}

class Bubble_Sort{
    public static void main(String args[]){

        bubble aa = new bubble();

        aa.getdata();

        System.out.println("Unsorted Array:-");
        aa.putdata();

    //     System.out.println("Sorted Array:-");
    //     aa.sort();

    //     aa.putdata();
     }
}