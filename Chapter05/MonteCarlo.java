import java.lang.Math;
public class MonteCarlo {
    public static void main(String[] args){
        int count = 0;
        int total = 100000;

        for(int i = 0; i < total; i++){
            if(Math.pow(Math.random(), 2) + Math.pow(Math.random(), 2) <= 1){
                count++;
            }
        }

        System.out.println(count);
        //double pi = (double) (count*4/total);
        double pi = (double)count*4/total;
        System.out.printf("%.3f%n", pi);
        System.out.println((double)count*4/total);

    }
}
