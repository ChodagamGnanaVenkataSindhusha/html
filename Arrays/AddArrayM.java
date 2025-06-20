//1
public class AddArrayM
{
    public static int addArray(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int[] arr = {5, 10, 15, 20};
        int result = addArray(arr);
        System.out.println("Total sum of array = " + result);
    }
}