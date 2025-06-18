public class IncDecOperators 
{
public static void showIncDec()
{
    int a = 5;
System.out.println("Initial value of a: " + a);
System.out.println("Post-increment (a++): " + (a++)); 
System.out.println("Pre-increment (++a): " + (++a));  
System.out.println("Post-decrement (a--): " + (a--)); 
System.out.println("Value after a--: " + a);
System.out.println("Pre-decrement (--a): " + (--a));  
}
public static void main(String[] args) 
{
    showIncDec();
    }
}