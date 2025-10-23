import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class EditingFile{
    public static void main(String[] args) {
        String str = new String();
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Input for File: ");
        str = sc.nextLine();

        try {
            FileWriter myWriter = new FileWriter("file1.txt");
            myWriter.write(str);
            myWriter.close();
            System.out.println("In File Edit Succefully");
        } catch (IOException e) {
            System.out.println("An Error Occurred.");
            e.printStackTrace();
        }
    }
}