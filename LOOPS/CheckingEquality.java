import java.util.Scanner;
 public class CheckingEquality
 {
 public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a value:");
 int a = sc.nextInt();
System.out.println("Enter b value:");
int b= sc.nextInt();
System.out.println("Equal:"+(a==b));
System.out.println(" Not Equal:"
+(a!=b));
}
}