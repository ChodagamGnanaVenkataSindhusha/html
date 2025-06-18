import java.util.Scanner;
public class DataTypes 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int age;              
float height;          
char grade;            
boolean Student;     
String name;        
System.out.print("Enter your name: ");
name = sc.nextLine();
System.out.print("Enter your age: ");
age = sc.nextInt();
System.out.print("Enter your height (in feet): ");
height = sc.nextFloat();
sc.nextLine(); 
System.out.print("Enter your grade (A/B/C): ");
grade = sc.nextLine().charAt(0);
System.out.print("Are you a student? (true/false): ");
Student = sc.nextBoolean();
System.out.println("Your Details");
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Height: " + height + " feet");
System.out.println("Grade: " + grade);
System.out.println(" Student: " + Student);
sc.close();
}
}