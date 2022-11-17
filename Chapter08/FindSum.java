public class FindSum {
    private static int sum(int n){
        if(n==1)
            return 1;
        else
            return n + sum(n-1);
    }

    //Driver method
    public static int getSum(int n){
        if(n>0)
            return sum(n);
        else{
            throw new IllegalArgumentException("Error: n must be positive");
        }
    }

    public static void main(String[] args){
        System.out.println(sum(5));
    }
}
