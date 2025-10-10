import java.util.Scanner;

class Addition{
    int a[][];
    int b[][];
    int c[][];
    int size1, size2;

        void getdata(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Row Size:- ");
        size1 = sc.nextInt();

        System.out.print("Enter the Array Colume Size:- ");
        size2 = sc.nextInt();

        a = new int [size1][size2];
        b = new int [size1][size2];
        c = new int [size1][size2];

        int i,j;
        for(i=0; i<size1; i++){
            for(j=0; j<size2; j++){
                System.out.print("Enter 1st Matrix :- ");
                a[i][j] = sc.nextInt();
            }
        }

        for(i=0; i<size1; i++){
            for(j=0; j<size2; j++){
                System.out.print("Enter 2st Matrix :- ");
                b[i][j] = sc.nextInt();
            }
        }
        
    }

    void showdata(){
        int i,j;
        System.out.println("\nMatrix 1st:- ");
        for(i=0; i<size1; i++){
            for(j=0; j<size2; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix 2st:- ");
        for(i=0; i<size1; i++){
            for(j=0; j<size2; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }

    void add(){
        int i,j;
        for(i=0; i<size1; i++){
            for(j=0; j<size2; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    void displaydata(){
        System.out.println("\nAddition of 2 Matrix:- ");

        int i,j;
        for(i=0; i<size1; i++){
            for(j=0; j<size2; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class TwoMatrixAddition{
    public static void main(String args[]){
        Addition aa = new Addition();

        aa.getdata();
        aa.showdata();
        aa.add();
        aa.displaydata();
        System.out.println();
    }
}