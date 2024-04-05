import java.util.*;
public class print_max_sum_of_subarray_kadane
{
    public static void kadane_sum(int array[])
    {
        int max_sum=Integer.MIN_VALUE;
        int current_sum=0;

        for(int i=0; i<=array.length-1; i++)
        {
            current_sum=current_sum + array[i];
            if(current_sum<0)
            {
                current_sum=0;
            }
            max_sum= Math.max( current_sum , max_sum);
        }
        System.out.println("our max xum of subArrays "+ max_sum);
    }
    public static void main(String args[])
    {
        int array[] = {-2 , -3 , 4 , -1 , -2 , 1, 5,-3};
        kadane_sum(array);
    }
}
