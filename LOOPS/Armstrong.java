import java.util.Scanner;
public class Armstrong
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n, temp, rem, sum = 0, count = 0;
System.out.print("Enter a number: ");
n = s.nextInt();
temp = n;
int t = n;
while (t > 0)
{
    t = t / 10;
    count++;
}
t = n;
while (t > 0) 
{
    rem = t % 10;
    int p = 1;
    for (int i = 1; i <= count; i++)
    {
        p = p * rem;
    }
    sum = sum + p;
    t = t / 10;
    }
if (sum == n)
System.out.println("Armstrong number");
else
System.out.println("Not an Armstrong number");
    }
}