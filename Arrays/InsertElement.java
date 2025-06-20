//7
public class InsertElement
{
    public static void insert(int[] a, int ele, int pos)
    {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < pos; i++)
        {
            b[i] = a[i];
        }
        b[pos] = ele;
        for (int i = pos; i < a.length; i++) 
        {
            b[i + 1] = a[i];
        }
        System.out.println("Array after insertion:");
        for (int i = 0; i < b.length; i++)
        {
            System.out.print(b[i] +" ");
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40};
        int element = 99;
        int position = 2;
        insert(arr, element, position);
    }
}