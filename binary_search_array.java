import java.util.*;
public class binary_search_array
{
    public static int bs(int numbers[] , int key)
    {
        int start = 0;
        int end = numbers.length-1;
        
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(numbers[mid]==key)
            {
                return mid;
            }
            if(numbers[mid]>key)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int numbers[]={1,2,3,4,5,6,15,47,57,78};
        int key=9;
        System.out.println("key  element is found at "+ bs(numbers , key));
    }
}