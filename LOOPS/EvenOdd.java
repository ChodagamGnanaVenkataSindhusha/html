import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[] args) 
    {
Scanner sc = new Scanner(System.in);
System.out.println("Enter start number: ");
int start = sc.nextInt();
System.out.println("Enter end number: ");
int end = sc.nextInt();
for (int i = start; i <= end; i++) 
{
    if (i % 2 == 0)
    {
    System.out.println(i +"is Even number");
    }
    else
    {
        System.out.println(i + " is Odd number");
    }
}
    }
}