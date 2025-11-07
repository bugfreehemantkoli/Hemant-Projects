import java.io.*;

class FileHandling{
    public static void main(String args[])throws IOException{
        File f = new File("C:\\Users\\PC\\Desktop\\Hemant-Projects\\Java_Beginner_Level\\test.txt");
        System.out.println(f.exists());
        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.canWrite());
        System.out.println(f.canRead());
        System.out.println(f.length());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        
        System.out.println();
        f.createNewFile();
        System.out.println();
        

        System.out.println(f.exists());
        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.canWrite());
        System.out.println(f.canRead());
        System.out.println(f.length());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());

        String s1 = "Hemant koli ";

        FileOutputStream f1 = new FileOutputStream("test.txt",true);
        int i;
        char c1[] = s1.toCharArray();
        for(i=0;i<s1.length();i++){
            f1.write(c1[i]);
        }
        f1.close();   
    }
}