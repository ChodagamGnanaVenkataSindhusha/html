import java.util.Scanner;
public class Palindrome
{
public static void main(String[] args)
{
Scanner s=new  Scanner(System.in);
System.out.print("Enter a  number:");
int num=s.nextInt();
int n=num;
int p=0;
while(num!=0)
{
 int rem=num%10;
p=p*10+rem;
num=num/10;
}
if(n==p)
{
System.out.println("The given number is palindrome");
}
else
{
System.out.println("Not a palindrome"); 
}
}
}