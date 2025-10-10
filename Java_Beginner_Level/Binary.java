import java.util.Scanner;

class BinarySearch{
    int a[] = new int[10];
    int key;
    int pos;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        int i;

        for(i=0; i<10; i++){
            System.out.print("Enter No. : ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter No. to Search : ");
        key = sc.nextInt();
    }

    void Search(){
        int i,j,mid,flag;
        i = 0;
        j = 9;
        flag = 0;
        

        while(i<=j && flag == 0){
            mid = (i+j)/2;

            if(a[mid] == key){
                flag = 1;
                pos = mid + 1;
            }else if(a[mid] > key){
                j = mid - 1;
            }else if(a[mid] < key){
                i = mid + 1;
            }
        }

        if(flag == 0){
            System.out.println("Not Found");
        }else{
            System.out.println("No. Found at "+pos);
        }
    }
}

class Binary{
    public static void main(String args[]){
        BinarySearch aa = new BinarySearch();

        aa.getdata();
        aa.Search();
    }
}

