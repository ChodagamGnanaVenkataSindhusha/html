//2
public class AvgArrayM
{
    public static double findAverage()
    {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            sum = sum + arr[i];
        }
        return (double) sum / arr.length;
    }
    public static void main(String[] args) 
    {
        double avg = findAverage();
        System.out.println("Average = " + avg);
    }
}