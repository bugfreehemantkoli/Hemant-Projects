import java.util.Scanner;
class ReverseEachWord{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = new String();

        System.out.print("Enter the String : ");
        str = sc.nextLine();

        int i,j,k;
        i = str.length()-1;

        while(i>=0){
            j = i;

            while(str.charAt(j) != ' ' && j > 0){
                j--;
            }

            if(j == 0){
                k = 0;
            }else{
                k = j + 1;
            }
            System.out.print(str.substring(k,i+1)+" ");
            i = j-1;
        }
    }
}