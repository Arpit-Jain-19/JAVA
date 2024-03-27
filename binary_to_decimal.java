public class binary_to_decimal
{
    public static void binTOdec( int binnum)
    {
        int pow = 0;
        int decimal =0;
        while(binnum > 0)
        {
            int lastdigit = binnum % 10;
            decimal = decimal + (lastdigit * (int)Math.pow(2 , pow));
            pow++;
            binnum = binnum/10;

        }
        System.out.println("decimal value is " + decimal);
    }
    public static void main(String args[])
    {
        binTOdec(101);

    }
}
