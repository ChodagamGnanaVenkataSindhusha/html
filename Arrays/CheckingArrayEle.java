//17
public class CheckingArrayEle
{
    public static boolean containsBoth(int[] arr) 
    {
        boolean found12 = false, found23 = false;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == 12) 
            {
                found12 = true;
            }
            if (arr[i] == 23) 
            {
                found23 = true;
            }
        }
        return found12 && found23;
    }

    public static void main(String[] args) 
    {
        int[] arr = {11, 12, 23, 34};
        System.out.println(containsBoth(arr));
    }
}