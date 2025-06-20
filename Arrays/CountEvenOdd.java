//15
public class CountEvenOdd
{
    public static void countEvenOdd(int[] arr)
    {
        int even = 0, odd = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                even++;
            } else
            {
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }

    public static void main(String[] args) 
{
        int[] arr = {10, 21, 30, 43, 55};
        countEvenOdd(arr);
    }
}