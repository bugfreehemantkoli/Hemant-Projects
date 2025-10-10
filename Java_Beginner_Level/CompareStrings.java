import java.util.Scanner;
class CompareStrings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = new String();
        String str2 = new  String();

        System.out.print("Enter the 1st String : ");
        str1 = sc.nextLine();
        System.out.print("Enter the 2nd String : ");
        str2 = sc.nextLine();

        if(str1.compareTo(str2) == 0){
            System.out.println("Equal String.");
        }else if(str1.compareTo(str2) > 0){
            System.out.println(str1+" is grater than "+str2);
        }else{
            System.out.println(str1+" is less than "+str2);
        }
    }
}