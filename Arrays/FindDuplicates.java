//10
public class FindDuplicates 
{
public static void findDuplicates(int[] arr) 
{
System.out.println("Duplicate elements are:");
for (int i = 0; i < arr.length; i++) 
{
for (int j = i + 1; j < arr.length; j++)
{
if (arr[i] == arr[j]) 
{
System.out.println(arr[i]);
break;
}
}
}
}
public static void main(String[] args) 
{
int[] array = {1, 4, 5, 2, 4, 1, 6, 7, 5};
findDuplicates(array);
}
}