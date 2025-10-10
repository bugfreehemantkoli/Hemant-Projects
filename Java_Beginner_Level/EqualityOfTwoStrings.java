import java.util.Scanner;
class EqualityOfTwoStrings{
    public static void main(String args[]){
        String str1 = new String();
        String str2 = new String();
        Scanner sc = new Scanner(System.in);

        System.out.println("***Enter Same Case Strings*** ");
        System.out.print("Enter the 1st String : ");
        str1 = sc.nextLine();
        System.out.print("Enter the 2nd String : ");
        str2 = sc.nextLine();

        if(str1.equals(str2)){
            System.out.println("Equal String.");
        }else{
            System.out.println("Not Equal String.");
        }

        System.out.println("\n***Enter Any Case Strings*** ");
        System.out.print("Enter the 1st String : ");
        str1 = sc.nextLine();
        System.out.print("Enter the 2nd String : ");
        str2 = sc.nextLine();

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Equal String.");
        }else{
            System.out.println("Not Equal String.");
        }
    }
}