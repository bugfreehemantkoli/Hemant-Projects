import java.util.Scanner;

class TwoD{
    int a[][];
    int size1, size2;
    void getdata(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Row Size:- ");
        size1 = sc.nextInt();

        System.out.print("Enter the Array Colume Size:- ");
        size2 = sc.nextInt();

        a = new int[size1][size2];

        int i,j;

        for(i=0; i<size1; i++){
            for(j=0; j<size2; j++){
                System.out.print("Enter the No. :");
                a[i][j] = sc.nextInt();
            }
        }
    }

    void putdata(){
        int i,j;

        System.out.println("\nThe 2D Array is:");
        for(i=0; i<size1; i++){
            for(j=0; j<size2; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class Array2D{
    public static void main(String args[]){
        TwoD aa = new TwoD();

        aa.getdata();
        aa.putdata();
    }
}