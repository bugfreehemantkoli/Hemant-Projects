import java.util.Scanner;

class multiply{
    int a[][];
    int b[][];
    int c[][];

    int i, j, size1, size2;

    void getdata(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Row Matrix Size :- ");
        size1 = sc.nextInt();

        System.out.print("Enter the Colume Matrix Size :- ");
        size2 = sc.nextInt();

        a = new int [size1][size2];
        b = new int [size1][size2];
        c = new int [size1][size2];

        System.out.println("\nEnter the Matrix Element :- ");

        for(i=0; i<size1; i++){
            for(j=0; j<size2; j++){
                System.out.print("Enter the No. (Matrix A):- ");
                a[i][j] = sc.nextInt();
            }
        }

        for(i=0; i<size1; i++){
            for(j=0; j<size2; j++){
                System.out.print("Enter the No. (Matrix B):- ");
                b[i][j] = sc.nextInt();
            }
        }
    }

    void displaydata(){
        System.out.println("\nMatrix A: ");
        for(i=0; i<size1; i++){
            for(j=0; j<size2; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Matrix B: ");
        for(i=0; i<size1; i++){
            for(j=0; j<size2; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }

    void mul(){
        int k;
        
        for(i=0; i<size1; i++){
            for(j=0; j<size2; j++){
                c[i][j] = 0;
                for(k=0; k<size1; k++){
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("\nMultiplication is : ");
        for(i=0; i<size1; i++){
            for(j=0; j<size2; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class MultiplyTwoMatrix{
    public static void main(String args[]){
        multiply aa = new multiply();

        aa.getdata();
        aa.displaydata();
        aa.mul();
        System.out.println();
    }
}