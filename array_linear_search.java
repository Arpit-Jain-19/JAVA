import java.util.*;
public class array_linear_search
{
    public static int linear_search( int numbers[] , int key)
    {
        for(int i=1 ; i<=numbers.length ; i++)
        {
            if(key==numbers[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int numbers[]={1,2,3,4,5,6,7,8,9,10,11,12};
        int key = 20;
        int index=linear_search(numbers , key);
        if(index== -1){
            System.out.println("key element is not found at index " );
        }
        else
            {
                System.out.println("key element is  found at "+ index);
            }
    }
}