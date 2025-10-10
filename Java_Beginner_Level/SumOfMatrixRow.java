import java.util.Scanner;

class SumOfMatrix{
    int a[][];
    int i,j,size;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Matrix:- ");
        size = sc.nextInt();
        System.out.println();

        a = new int[size][size];

        for(i=0; i<size; i++){
            for(j=0; j<size; j++){
                System.out.print("Enter the Matrix Element: ");
                a[i][j] = sc.nextInt();
            }
        }
    }

    void displaydata(){
        System.out.println("\nMatrix :");
        for(i=0; i<size; i++){
            for(j=0; j<size; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    void rowsum(){
        int sum=0;
        System.out.println();
        for(i=0; i<size; i++){
            sum =0;
            for(j=0; j<size; j++){
                sum = sum + a[j][i];
            }
            System.out.println("Sum of "+(i+1)+" row = "+sum);
        }
    }
}

class SumOfMatrixRow{
    public static void main(String args[]){

        SumOfMatrix aa = new SumOfMatrix();

        aa.getdata();
        aa.displaydata();
        aa.rowsum();
        System.out.println();
    }
}