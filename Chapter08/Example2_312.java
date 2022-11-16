public class Example2_312 {
    public static void main(String[] args){
        Example2_312 Q = new Example2_312();
        Q.catastrophe(5);
    }

    public void catastrophe(int n){
        System.out.println(n);
        catastrophe(5);
    }
}