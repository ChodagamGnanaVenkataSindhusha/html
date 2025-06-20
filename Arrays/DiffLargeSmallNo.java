//16
public class DiffLargeSmallNo
{
    public static int difference(int[] arr) 
    {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
            if (arr[i] > max) 
            {
                max = arr[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 5, 40, 25};
        System.out.println("Difference:"+difference(arr));
    }
}