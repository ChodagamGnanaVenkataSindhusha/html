public class ArithmeticOperations 
{
public static void calculate(int a, int b)
{
    System.out.println("Addition       : " + (a + b));
    System.out.println("Subtraction    : " + (a - b));
    System.out.println("Multiplication : " + (a * b));
    System.out.println("Division       : " + (a / b));
    System.out.println("Modulus        : " + (a % b));
}
public static void main(String[] args)
{
    int a= 20,b= 6;
    calculate(a,b);
}
}