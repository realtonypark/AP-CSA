import java.lang.Math;

public class CompareTest {
    public static void main(String[] args){
        double a1 = 4.55555550;
        double a2 = 4.55555551;

        System.out.println(Double.compare(a1, a2));

        double epsilon = 0.0000000001;
        if(Math.abs(a1-a2) < epsilon)
            System.out.println("a1 == a2");
        else
            System.out.println("a1 != a2");
    }
}