import java.util.*;
public class sum_of_N_natural_num{
    public static void main( String args[]) {
        System.out.print("enter the value of N :-");
        Scanner sc= new Scanner(System.in);
        int counter = 1;
        int sum=0;
        int n = sc.nextInt();
        while (counter<=n){
            sum = sum + counter;
            counter++;
        }
        System.out.println(sum);
    }
}
