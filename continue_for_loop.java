public class continue_for_loop{
    public static void main(String args[]){
        int n = 7;
        for(int i=1 ; i<=n ; i++){
            if( i==3){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("one number s missig using CONTINUE Keyword");
    }
}
