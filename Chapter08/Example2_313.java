public class Example2_313 {
    public static void main(String[] args){
        revDigs(147);
    }
    
    public static void revDigs(int n){
        System.out.print(n%10);
        if(n/10 != 0)
            revDigs(n/10);
    }
}