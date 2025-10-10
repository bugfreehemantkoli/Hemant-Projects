import java.util.Scanner;
class WordsCounts{
    public static void main(String args[]){
        int i,count=1;
        Scanner sc = new Scanner(System.in);
        String str = new String();

        System.out.print("Enter the String :- ");
        str = sc.nextLine();

        for(i=0; i<str.length(); i++){
            
            if(str.charAt(i) == ' ' && str.charAt(i+1) != ' '){
                count++;
            }
        }
        System.out.println("Total words are = "+count);
    }
}