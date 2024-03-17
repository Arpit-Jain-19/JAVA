import java.util.*;
public class counting {
    public static void main( String args[]) {
        System.out.print("enter the last number");
        Scanner sc= new Scanner(System.in);
        int counter = 1;
        int n = sc.nextInt();
        while (counter<=n){
            System.out.println(counter);
            counter++;
        }
    }
}
