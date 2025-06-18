public class VariableScope
{
    int number = 45;
public void Variables() 
{
    int number = 150;
System.out.println("Local variable number = " + number);  
System.out.println("Global variable number = " + this.number);  
 }
public static void main(String[] args) {
        VariableScope obj = new VariableScope();
        obj.Variables();
    }
}