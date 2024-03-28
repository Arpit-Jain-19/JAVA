import java.util.*;
public class pelindrome_number_check
{
    public static void main( String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any nymber:");
        int input= sc.nextInt();

        if(pelindrome(input))
        {
            System.out.println("the number "+ input + " is pelindrome");
        }
        else
        {
            System.out.println("the number "+ input + " is NOT pelindrome");
        }
    }
    public static boolean pelindrome( int n)
    {
        int temp = n ;
        int rev = 0 ;
        while(temp!=0)
        {
            int rem = temp %10;
            rev=(rev*10)+rem;
            temp = temp/10;

        }
        System.out.println(rev);
        System.out.println(n);
        System.out.println(temp);
        if(n==rev)
        {
            return true;
        }
        else 
        {
            return false ;
        }

    }
}
