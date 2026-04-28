// Returning information about an object in Java
import java.util.Scanner;

class Student {
    
    private String name;
    private double grade;
	
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
	
    public String getName() {
        return name;
    }
	
    public String getPassStatus() {
        return (grade >= 35) ? "Passing" : "Failing";
    }
	
    @Override
    public String toString() {
        return "Student Report [Name: " + name + ", Grade: " + grade + "]";
    }
}

public class JAVA_45_Returning_Info_through_Object{
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\n------------------------------------------");
		
		System.out.print("Enter the Name : ");
		String name = input.nextLine();
		
		System.out.print("Enter the Marks : ");
		float marks = input.nextFloat();
		
		System.out.println("------------------------------------------");
		
        Student s1 = new Student(name, marks);
				
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Status: " + s1.getPassStatus());
        System.out.println(s1.toString());
		
		System.out.println("------------------------------------------");
		
    }
}