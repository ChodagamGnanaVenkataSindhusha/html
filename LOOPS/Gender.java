import java.util.Scanner;
public class Gender 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char gender = sc.next().charAt(0);
        switch(gender) 
        {
            case 'M':
                case 'm': 
                System.out.println("Male"); 
                break;
            case 'F':
                case 'f': 
                System.out.println("Female");
                break;
            default: System.out.println("Invalid");
        }
    }
}