//3
import java.util.Scanner;
public class IndexArray
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) { 
            arr[i] = s.nextInt();
            }
        System.out.println("Enter element to search: ");
        int num = s.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == num)
            {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Number found at index: " + index);
        } 
        else
        {
            System.out.println("Number not found in the array");
        }
    }
}