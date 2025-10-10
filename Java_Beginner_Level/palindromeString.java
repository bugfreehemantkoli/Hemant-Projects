import java.util.Scanner;

class palindromeString{
    public static void main(String args[]){
        String str = new String();
        Scanner sc = new Scanner(System.in);
        int i,j,flag;

        System.out.print("Enter String to Check: ");
        str = sc.nextLine();
        
        i = 0;
        j = str.length()-1;
        flag = 0;

        while(i<j && flag == 0){
            if(str.charAt(i) != str.charAt(j)){
                flag = 1;
            }
            i++;
            j--;
        }
        if(flag == 0){
            System.out.println("Palindrime");
        }else{
            System.out.println("Not Palindrime");
        }
    }
}