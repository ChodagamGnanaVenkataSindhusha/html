public class FindMissingNumber
{
    public static int findMissing(int[] arr)
    {
        for (int i = 1; i <= 100; i++) 
           {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) 
            {
                if (arr[j] == i)
                {
                    found = true;
                    break;
                }
            }

            if (!found)
            {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = new int[99];
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (i != 74) 
            {
                arr[index] = i;
                index++;
            }
        }
        int missing = findMissing(arr);
        System.out.println("Missing number is: " + missing);
    }
}