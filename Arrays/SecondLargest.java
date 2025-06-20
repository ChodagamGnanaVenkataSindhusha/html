//13,14
public class SecondLargest
{
    public static int findSecondLargest(int[] arr) 
    {
        int max = arr[0];
        int second = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] != max && arr[i] > second)
            {
                second = arr[i];
            }
        }

        return second;
    }

    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40, 50};
        int result = findSecondLargest(arr);
        System.out.println("Second largest: " + result);
    }
}