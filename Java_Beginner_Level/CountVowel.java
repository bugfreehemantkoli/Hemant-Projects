import java.util.Scanner;
class CountVowel{
    public static void main(String args[]){
    int i,volcount=0,concount=0;
    char ch;
    Scanner sc = new Scanner(System.in);
    String str = new String();

    System.out.print("Enter the String :- ");
    str = sc.nextLine();
    //str = str.toUpperCase();
    int len = str.length();

    for(i=0; i<len; i++){
        ch = str.charAt(i);
        if(ch != ' '){
            if(ch == 'a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u'){
                volcount++ ;
            }else{
                concount++;
            }
        }  
    }
    System.out.println(str);
    System.out.println(volcount);
    System.out.println(concount);
    }
}