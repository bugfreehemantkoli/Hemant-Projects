import java.util.Scanner;

public class CallMenu{
    public static Scanner sc = new Scanner(System.in);
    

    static void mainMenu() {
        
        System.out.println("\n---Main Menu---");
        System.out.println("1. English");
        System.out.println("2. Hindi");
        System.out.println("3. Exit");

        System.out.print("Enter the choice: ");
        int choice = sc.nextInt();

        if(choice == 1){
            englishMenu();
        } else if(choice == 2){
            hindiMenu();
        } else if(choice == 3){
            System.out.println("Thank you for calling. Goodbye!");
            return;
        } else {
            System.out.println("Invalid choice. Please try again.");
            mainMenu();
        }
    }

    static void englishMenu() {
        System.out.println("\n---English Menu---");
        System.out.println("1. For Internet Issue, press 1");
        System.out.println("2. For Balance Inquiry, press 2");
        System.out.println("3. Switch to Hindi, press 3");

        System.out.print("Enter the choice: ");
        int choice = sc.nextInt();

        if(choice == 1){
            System.out.println("Redirecting to Internet Support.");
            englishMenu();
        } else if(choice == 2){
            System.out.println("Your Balance is ₹56.30.");
            englishMenu();
        } else if(choice == 3){
            mainMenu();
        } else {
            System.out.println("Invalid choice. Please try again.");
            englishMenu();
        }
    }

    static void hindiMenu() {
        System.out.println("\n---Hindi Menu---");
        System.out.println("1. इंटरनेट समस्या के लिए, 1 दबाएं");
        System.out.println("2. बैलेंस जांच के लिए, 2 दबाएं");
        System.out.println("3. अंग्रेजी में स्विच करने के लिए, 3 दबाएं");

        System.out.print("Enter the choice: ");
        int choice = sc.nextInt();

        if(choice == 1){
            System.out.println("इंटरनेट समर्थन पर रीडायरेक्ट कर रहे हैं।");
            hindiMenu();
        } else if(choice == 2){
            System.out.println("आपका बैलेंस ₹56.30 है।");
            hindiMenu();
        } else if(choice == 3){
            mainMenu();
        } else {
            System.out.println("अमान्य विकल्प। कृपया पुनः प्रयास करें।");
            hindiMenu();
        }
    }

    public static void main(String[] args) {
    
        System.out.println("Welcom to Customer Care. ");
        mainMenu();
    }
}