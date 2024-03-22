public class break_for_loop{
    public static void main(String args[]){
        int n = 5;
        for(int i=1 ; i<=n ; i++){
            if( i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("i am out of the loop");
    }
}