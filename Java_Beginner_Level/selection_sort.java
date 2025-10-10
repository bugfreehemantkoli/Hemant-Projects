import java.util.Scanner;

class selection{
    int a[];
    int size;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.print("Enter the size of Array : ");
        size = sc.nextInt();

        a = new int[size];

        for(i=0; i<size; i++){
            System.out.print("Enter No's. :");
            a[i] = sc.nextInt();
        }
    }

    void sort(){
        int i,j,t;

        for(i=0; i<size - 1; i++){
            for(j=i+1; j<size; j++){
                if(a[i] > a[j]){
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
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

class selection_sort{
    public static void main(String args[]){

        selection aa = new selection();

        aa.getdata();

        System.out.println("\nUnsorted Array:-");
        aa.putdata();

        System.out.println("\nSorted Array:-");
        aa.sort();

        aa.putdata();
    }
}