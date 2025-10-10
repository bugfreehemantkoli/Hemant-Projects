import java.util.Scanner;
class shortName{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = new String();
        
        System.out.print("Enter the String : ");
        str = sc.nextLine();

        int i,j=0;
        char c,d;

        i = str.length()-1;

        while(str.charAt(i) != ' '){
            i--;
        }
        

        while(j<i){
            if(j == 0){
                System.out.print(str.charAt(j)+".");
            }else{
                c = str.charAt(j);
                d = str.charAt(j+1);

                if(c == ' ' && d != ' '){
                    System.out.print(d + ".");
                }
            }
            j++;
        }
        System.out.print(str.substring(i+1));
    }
}