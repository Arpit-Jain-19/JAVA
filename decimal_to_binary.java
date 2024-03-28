public class decimal_to_binary
{
    public static void decTObin( int decNum)
    {
        int pow = 0;
        int binary =0;
        while(decNum > 0)
        {
            int rem = decNum % 2;
            binary = binary + (rem * (int)Math.pow(10 , pow));
            pow++;
            decNum = decNum/2;

        }
        System.out.println("Binary value is " + binary);
    }
    public static void main(String args[])
    {
        decTObin(5);

    }
}
