//5
public class RemoveElement 
{
    public void removeElement(int[] arr, int value)
    {
        System.out.print("Array after removing " + value + ": ");
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != value) 
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
 public static void main(String[] args) 
    {
        int[] numbers = {10, 20, 30, 20, 40, 50};
        int remove = 20;
        RemoveElement obj = new RemoveElement();
        obj.removeElement(numbers, remove);
    }
}