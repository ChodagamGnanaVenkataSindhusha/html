//6
public class CopyArray 
{
    int[] original = {5, 10, 15, 20};
    int[] copy = new int[4];
    public void copyArray() 
    {
        for (int i = 0; i < original.length; i++) 
        {
            copy[i] = original[i];
        }
        System.out.print("Copied array: ");
        for (int i = 0; i < copy.length; i++) 
        {
            System.out.print(copy[i] + " ");
        }
    }
    public static void main(String[] args) 
    {
        CopyArray obj = new CopyArray();
        obj.copyArray();
    }
}