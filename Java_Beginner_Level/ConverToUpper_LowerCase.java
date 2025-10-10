import java.util.Scanner;
class ConverToUpper_LowerCase{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = new String();

        System.out.print("Enter the String To Change in Both Upper & Lower : ");
        str = sc.nextLine();

        System.out.println(str+" -> String in Upper Case = "+str.toUpperCase());
        System.out.println(str+" -> String in Lower Case = "+str.toLowerCase());
    }
}