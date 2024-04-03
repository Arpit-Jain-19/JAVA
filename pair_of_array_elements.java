import java.util.*;
public class pair_of_array_elements
{
    public static void pair(int array[])
    {
        for(int i=0; i<array.length-1; i++)
        {
            for(int j=i+1; j<=array.length-1; j++)
            {
                System.out.print("("+ array[i]+ "," +array[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int array[]={1,2,3,4,5};
        pair(array);

    }
}