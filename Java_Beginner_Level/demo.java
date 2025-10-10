import java.util.Scanner;

class linear{
    int a[] = new int[10];
    int key, pos;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        int i;

        for(i=0; i<10; i++){
            System.out.print("enter No. : ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter No. to Search : ");
        key = sc.nextInt();
    }

    void search(){
        int i, flag=0 ;

        for(i=0; i<10 && flag ==0; i++){
            if(a[i]==key){
                flag = 1;
                pos = i + 1;
            }
        }

        if(flag == 1)
        System.out.println("No. found "+pos);
        else
        System.out.println("No. not found");
    }
}

class demo{
    public static void main(String args[]){
        linear aa = new linear();
        aa.getdata();
        aa.search();
    }
}