public class UnaryOperators
{
    public static void main(String[] args)
{
        int a = 5;
        int b = -10;
        boolean flag = true;
        System.out.println("Unary Plus of a: " + (+a));    
        System.out.println("Unary Minus of b: " + (-b));  
        System.out.println("Pre-increment: " + (++a));  
        System.out.println("Post-increment: " + (a++));    
        System.out.println("After post-increment: " + a);
        System.out.println("Pre-decrement: " + (--a));
        System.out.println("Post-decrement: " + (a--));  
        System.out.println("After post-decrement: " + a);  
        System.out.println("Logical NOT of true: " + (!flag));
}
}