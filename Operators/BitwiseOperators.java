public class BitwiseOperators
{
    public static void main(String[] args)
    {
        int a = 5;   
        int b = 3;
System.out.println("a = " + a);
System.out.println("b = " + b);
System.out.println("a & b (AND) = " + (a & b)); 
System.out.println("a | b (OR)  = " + (a | b));  
System.out.println("a ^ b (XOR) = " + (a ^ b)); 
System.out.println("~a (NOT) = " + (~a)); 
System.out.println("a << 1 (Left shift)  = " + (a << 1));
System.out.println("a >> 1 (Right shift) = " + (a >> 1)); 
    }
}