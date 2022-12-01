public class Square {
    public static void main(String[] args){
        System.out.println(square(4, 3));
    }

    private static int square(int base, int js){
        if(js == 1)
            return base;
        return base * square(base, js-1);
    }
}