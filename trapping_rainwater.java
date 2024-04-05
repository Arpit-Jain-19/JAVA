import java.util.*;
public class trapping_rainwater
{
    public static int trap(int height[])
    {
        // left boundary
        int n= height.length;
        int left_max[]= new int[n];
        left_max[0]=height[0];
        for (int i=1 ; i<n ; i++)
        {
            left_max[i]=Math.max(height[i], left_max[i-1]);
        }


        // right buondary
        int right_max[]=new int[n];
        right_max[n-1]=height[n-1];
        for(int i=n-2; i>=0 ; i--)
        {
            right_max[i]=Math.max(height[i],right_max[i+1]);
        }



        // loop
        int trapped_rain=0;
        for(int i=0; i<n; i++ )
            {
                // water_level-height)*width
                int water_level= Math.min(left_max[i],right_max[i]);
                 trapped_rain+=water_level-height[i]; 
            }
        return trapped_rain;
        
    }
    
    public static void main(String args[])
    {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trap(height));

    }
}