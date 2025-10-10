import java.util.Scanner;

class IntroStringBuffer{
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        str.append(sc.nextLine());

        str.setCharAt(3, 'u');
        System.out.println(str);

        str.insert(3, "ABCD");
        System.out.println(str);
        
        str.setLength(3);
        System.out.println(str);
    }
}