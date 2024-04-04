import java.util.*;
public class print_sum_of_subarray
{
    public static void subarray_sum(int array[])
    {
        int max_sum= Integer.MIN_VALUE;
        
        for(int i=0; i<=array.length-1; i++)
        {
            int start=i;
            for(int j=i; j<=array.length-1; j++)
            {
                int end=j;
                int current_sum=0;
                for(int k=start; k<=end; k++)
                {
                    current_sum+=array[k];
                }
                System.out.print( current_sum +"   ");
                if(max_sum<current_sum)
                {
                    max_sum=current_sum;
                }

            }
            System.out.println();

        }
        System.out.println("maximun "+ max_sum);
    }
    public static void main(String args[])
    {
        int array[]={1,2,3,4,5};
        subarray_sum(array);
    }

    
}