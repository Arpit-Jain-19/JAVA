import java.util.*;
public class largest_integer_in_array
{
    public static int GetLargest(int numbers[])
    {
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for( int i=0 ; i<numbers.length ; i++)
        {
            if(numbers[i]>large)
            {
                large=numbers[i];
            }
            if(numbers[i]<small)
            {
                small=numbers[i];
            }
        }
        System.out.println("smallest value; "+ small);
        return large;
    }
    public static void main(String args[])
    {
        int numbers[]={1,2,3,4,5,6,7,8,9,10,11,12};
        int largest=GetLargest(numbers);
        System.out.println(largest);

    }
}