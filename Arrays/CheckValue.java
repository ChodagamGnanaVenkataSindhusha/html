//4
public class CheckValue
{
    public void checkValue(int[] arr, int value)
    {
        boolean found = false;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == value) 
            {
                found = true;
                break;
            }
        }
        if (found)
        {
            System.out.println(value + " is found in the array.");
        }
        else 
        {
            System.out.println(value + " is not found in the array.");
        }
    }
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50};
        int check = 30;
        CheckValue obj = new CheckValue();
        obj.checkValue(numbers, check);
    }
}