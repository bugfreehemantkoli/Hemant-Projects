import java.util.Scanner;
class substring_concat_indexof{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = new String();
        String str2 = new String();

        System.out.print("Enter the 1st String : ");
        str1 = sc.nextLine();
        System.out.print("Enter the 2st String : ");
        str2 = sc.nextLine();

        System.out.println("subString(n) = "+str1.substring(2));
        System.out.println("subString(n,m) = "+str1.substring(2,5));
        System.out.println("subString(n) = "+str1.indexOf('m'));
        System.out.println("subString(n,m) = "+str1.indexOf('m',3));
        System.out.println("ConCat of Both String = "+str1.concat(" "+str2));
    }
}