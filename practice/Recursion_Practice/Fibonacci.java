public class Fibonacci {
    public static void main(String[] args){
        System.out.println(fibonacci(8)); // prints out number 21, which is the 8th fibonacci number.
    }

    private static int fibonacci(int n){
        if(n==1 || n==2)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
