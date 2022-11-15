public class Example1 {
    public static void main(String[] args){
        Example1 Q = new Example1();
        Q.drawLine(5);
    }

    public void drawLine(int n){
        if(n==0)
            System.out.println("That's all, folks!");
        else{
            for(int i=1; i<=n; i++)
                System.out.print("*");
            System.out.println();
            drawLine(n-1);
        }
    }
}