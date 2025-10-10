import java.util.Scanner;

class Insertion{
    int a[];
    int size;


    void getdata(){
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.print("Enter the Array Size : ");
        size = sc.nextInt();

        a = new int[size];


        for(i=0; i < size; i++){
            System.out.print("Enter No.'s : ");
            a[i] = sc.nextInt();
        }
    }

    

    void sort(){
        int i, val, j;

        for(i=1; i < size; i++){
            val = a[i];
            j = i-1;

            

            while(val < a[j]){      //while (j >= 0 && a[j] > val) {       a[j + 1] = a[j];        j--;
                a[j+1] = a[j];
                j--;

                if(j == -1){
                    break;
                }                
            }
            a[j+1] = val;
        }
    }

    void putdata(){
        int i;
        for(i=0; i < size; i++){
            System.out.println(a[i]);
        }
    }
}

class Insertion_Sort{
    public static void main(String args[]){
        Insertion aa = new Insertion();

        aa.getdata();

        System.out.println("\nUnsorted Array:- ");
        aa.putdata();

        aa.sort();

        System.out.println("\nSorted Array:- ");
        aa.putdata();
    }
}