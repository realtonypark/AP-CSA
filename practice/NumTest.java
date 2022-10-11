import java.lang.Math;

public class NumTest {
    public static void main(String[] args){
        double n1 = 4.8343443;
        double n2 = 4.8343442;
        double epsilon = Math.pow(10, -16);
        
        System.out.println(epsilon);
        System.out.println(Math.abs(n1-n2) < epsilon * Math.max(Math.abs(n1), Math.abs(n2)));
    }
}
