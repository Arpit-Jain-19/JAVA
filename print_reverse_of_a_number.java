import java.util.*;
public class print_reverse_of_a_number {
    public static void main( String args[]) {
        int n= 123572;
        while(n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
        }
        System.out.println();
    }
}
