import java.util.Scanner;
class stringExample{
    public static void main(String args[]){
        String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        str = sc.nextLine();
        int len, i;
        len = str.length();
        System.out.println(str);
        System.out.println(str.length());           //length()
        System.out.println(str.charAt(2));   //charAt()
        System.out.println();

        for(i=0; i<len; i++){
            System.out.println(str.charAt(i));
        }
    }
}