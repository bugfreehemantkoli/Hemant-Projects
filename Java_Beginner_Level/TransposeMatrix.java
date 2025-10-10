import java.util.Scanner;

class transpose{
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
        System.out.println("\nBefor Transpose Matrix :");
        for(i=0; i<size; i++){
            for(j=0; j<size; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    void trans(){
        System.out.println("\nAfter Transpose Matrix :- ");

        for(i=0; i<size; i++){
            for(j=0; j<size; j++){
                System.out.print(a[j][i]+ " ");
            }
            System.out.println();
        }
    }

    
}

class TransposeMatrix{
    public static void main(String args[]){

        transpose aa = new transpose();

        aa.getdata();
        aa.displaydata();
        aa.trans();
        System.out.println();
    }
}