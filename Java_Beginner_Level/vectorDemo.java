import java.util.*;
class vectorDemo{
    public static void main(String args[]){
        Vector<String> str = new Vector<String>();
        
        str.addElement("SHYAM");
        str.addElement("SITA");
        str.addElement("GITA");
        str.addElement("Hemant");

        System.out.println();
        System.out.println("The List is : " + str);

        str.insertElementAt("RAVI", 2);
        System.out.println("The List Now is : "+ str);

        System.out.println("Size of List    : "+ str.size());

        str.removeElement("SITA");
        System.out.println("Remove SITA : "+ str);

        str.removeElementAt(1);
        System.out.println("Remove Element Index    : " +  str);

        str.removeAllElements();
        System.out.println("Remove All Element  : "+ str);
    }
}