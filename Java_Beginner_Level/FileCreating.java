import java.io.File;
import java.io.IOException;

public class FileCreating{
public static void main(String args[]){

try{
File myobj = new File("file1.txt");

if(myobj.createNewFile()){
System.out.println("File  created "+ myobj.getName());
}else{
System.out.println("File Already Exists.");
}
}

catch(IOException e){
System.out.println("An Error Occured");
e.printStackTrace();
}
}
} 