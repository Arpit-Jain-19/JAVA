import java.util.*;
public class print_max_sum_of_subarray_prefix
{
    public static void subarray_sum(int array[])
    {
        int current_sum=0;
        int max_sum= Integer.MIN_VALUE;
        int prefix[]= new int[array.length];

        // calculate prefix
        prefix[0]=array[0];
        for(int a=1; a<prefix.length; a++)
        {
            prefix[a]= prefix[a-1]+array[a];
        }
        for(int i=0; i<=array.length-1; i++)
        {
            int start=i;
            for(int j=i; j<=array.length-1; j++)
            {
                int end=j;
                
                current_sum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                // for(int k=start; k<=end; k++)
                // {
                //     current_sum+=array[k];
                // }
                //System.out.print( current_sum +"   ");
                if(max_sum<current_sum)
                {
                    max_sum=current_sum;
                }

            }
            System.out.print("");

        }
        System.out.println("maximun "+ max_sum);
    }
    public static void main(String args[])
    {
        int array[]={1,2,3,4,5};
        subarray_sum(array);
    }

    
}