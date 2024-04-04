import java.util.*;
public class print_subarray_of_an_array
{
    public static void subarray(int array[])
    {
        for(int i=0; i<=array.length-1; i++)
        {
            int start=i;
            
            for(int j=i; j<=array.length-1; j++)
            {
                int end=j;
                
                for(int k=start; k<=end; k++)
                {
                    System.out.print( array[k]+" ");
                }
                System.out.print("     ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int array[]={1,2,3,4,5};
        subarray(array);

    }

    
}