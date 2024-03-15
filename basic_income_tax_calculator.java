import java.util.*;
public class basic_income_tax_calculator 
{
    public static void main( String args[]) 
    {
        System.out.println("Income should be positive ");
        System.out.println("Amount in Lakhs");
        Scanner sc = new Scanner (System.in);
        int income = sc.nextInt();

        if(income<=500000){
            System.out.println("you are not eligible to pay direct tax");
        }
        else if(income>=500000 && income<=1000000){
            int tax = (int)(income*(0.2));
            System.out.println("your tax ammount is: "+tax);
        }
        else{
            int tax = (int)(income*(0.3));
            System.out.println("your tax ammount is :" +tax);
        }
    }    
}    
